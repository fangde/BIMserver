package org.bimserver.longaction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.bimserver.shared.ResultType;

public class DownloadParameters {
	public enum DownloadType {
		DOWNLOAD, DOWNLOAD_BY_OIDS, DOWNLOAD_BY_GUIDS, DOWNLOAD_OF_TYPE, DOWNLOAD_PROJECTS
	};

	private Set<Long> roids;
	private Set<Long> oids;
	private Set<String> guids;
	private String className;
	private ResultType resultType;
	private DownloadType downloadType;

	public DownloadParameters() {
		downloadType = DownloadType.DOWNLOAD;
		resultType = ResultType.IFC;
	}

	public DownloadParameters(long roid, ResultType resultType) {
		setRoid(roid);
		setDownloadType(DownloadType.DOWNLOAD);
		setResultType(resultType);
	}

	public DownloadParameters(Set<Long> roids, Set<String> guids, ResultType resultType) {
		setRoids(roids);
		setGuids(guids);
		setDownloadType(DownloadType.DOWNLOAD_BY_GUIDS);
		setResultType(resultType);
	}

	public DownloadParameters(ResultType resultType, Set<Long> roids, Set<Long> oids) {
		setRoids(roids);
		setGuids(guids);
		setDownloadType(DownloadType.DOWNLOAD_BY_OIDS);
		setResultType(resultType);
	}

	public DownloadParameters(long roid, String className, ResultType resultType) {
		setRoid(roid);
		setClassName(className);
		setDownloadType(DownloadType.DOWNLOAD_OF_TYPE);
		setResultType(resultType);
	}

	public DownloadParameters(Set<Long> roids, ResultType resultType) {
		setRoids(roids);
		setDownloadType(DownloadType.DOWNLOAD_PROJECTS);
		setResultType(resultType);
	}

	public String getId() {
		return String.valueOf(((long) hashCode()) + Integer.MAX_VALUE) + "." + resultType.getDefaultExtension();
	}

	public Set<Long> getRoids() {
		return roids;
	}

	public void setRoids(Set<Long> roids) {
		this.roids = roids;
	}

	public Long getRoid() {
		if (roids == null)
			return null;
		Iterator<Long> iterator = roids.iterator();
		return iterator.hasNext() ? iterator.next() : null;
	}

	public void setRoid(Long roid) {
		this.roids = new HashSet<Long>();
		roids.add(roid);
	}

	public Set<Long> getOids() {
		return oids;
	}

	public void setOids(Set<Long> oids) {
		this.oids = oids;
	}

	public Set<String> getGuids() {
		return guids;
	}

	public void setGuids(Set<String> guids) {
		this.guids = guids;
	}

	public ResultType getResultType() {
		return resultType;
	}

	public void setResultType(ResultType resultType) {
		this.resultType = resultType;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public DownloadType getDownloadType() {
		return downloadType;
	}

	public void setDownloadType(DownloadType downloadType) {
		this.downloadType = downloadType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		result = prime * result + ((downloadType == null) ? 0 : downloadType.hashCode());
		result = prime * result + ((guids == null) ? 0 : guids.hashCode());
		result = prime * result + ((oids == null) ? 0 : oids.hashCode());
		result = prime * result + ((resultType == null) ? 0 : resultType.hashCode());
		result = prime * result + ((roids == null) ? 0 : roids.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DownloadParameters other = (DownloadParameters) obj;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (downloadType == null) {
			if (other.downloadType != null)
				return false;
		} else if (!downloadType.equals(other.downloadType))
			return false;
		if (guids == null) {
			if (other.guids != null)
				return false;
		} else if (!guids.equals(other.guids))
			return false;
		if (oids == null) {
			if (other.oids != null)
				return false;
		} else if (!oids.equals(other.oids))
			return false;
		if (resultType == null) {
			if (other.resultType != null)
				return false;
		} else if (!resultType.equals(other.resultType))
			return false;
		if (roids == null) {
			if (other.roids != null)
				return false;
		} else if (!roids.equals(other.roids))
			return false;
		return true;
	}
}