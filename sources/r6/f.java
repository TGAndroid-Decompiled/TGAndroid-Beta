package r6;

import android.os.IInterface;
public interface f extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z4, int i10);

    int getIntFlagValue(String str, int i10, int i11);

    long getLongFlagValue(String str, long j10, int i10);

    String getStringFlagValue(String str, String str2, int i10);

    void init(l6.a aVar);
}
