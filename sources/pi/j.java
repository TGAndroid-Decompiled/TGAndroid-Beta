package pi;
public interface j {
    void onCompleted(p pVar);

    void onError(Exception exc);

    void onMaximumDurationReached();

    void onPreviewPlaybackChanged(boolean z10);

    void onPreviewProgress(long j3, long j10);

    void onPreviewReady(long j3, long j10, long j11, byte[] bArr);

    void onRecordingProgress(long j3, double d);

    void onRecordingTooShort(long j3);

    void onStateChanged(r rVar);
}
