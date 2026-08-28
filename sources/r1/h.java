package r1;

import android.system.Os;
import java.io.FileDescriptor;
public abstract class h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j10, int i9) {
        return Os.lseek(fileDescriptor, j10, i9);
    }
}
