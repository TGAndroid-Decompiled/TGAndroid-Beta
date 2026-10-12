package pi;

import java.io.File;
public interface p {
    void onBytesAvailable(long j3, File file, long j10, long j11);

    void onOutputCompleted(long j3, File file, long j10, long j11);

    void onOutputError(long j3, Exception exc);

    void onOutputInvalidated(long j3, o oVar);

    void onOutputStarted(long j3, File file);
}
