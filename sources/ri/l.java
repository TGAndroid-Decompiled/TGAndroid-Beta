package ri;

import java.io.File;
public interface l {
    void onBytesAvailable(long j10, File file, long j11, long j12);

    void onOutputCompleted(long j10, File file, long j11, long j12);

    void onOutputError(long j10, Exception exc);

    void onOutputInvalidated(long j10, k kVar);

    void onOutputStarted(long j10, File file);
}
