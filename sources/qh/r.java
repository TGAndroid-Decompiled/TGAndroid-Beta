package qh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
public final class r {
    public static ArrayList f45970f;
    public final String f45971a;
    public final int f45972b;
    public final int f45973c;
    public final int[] d;
    public final ArrayList f45974e = new ArrayList();

    public r(String str) {
        str = str == null ? "." : str;
        this.f45971a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f45973c = length;
        this.d = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < split.length; i11++) {
            this.d[i11] = split[i11].length();
            i10 = Math.max(i10, split[i11].length());
        }
        this.f45972b = i10;
        for (int i12 = 0; i12 < split.length; i12++) {
            for (int i13 = 0; i13 < split[i12].length(); i13++) {
                this.f45974e.add(new q(this, i13, i12));
            }
        }
    }

    public static ArrayList a() {
        if (f45970f == null) {
            ArrayList arrayList = new ArrayList();
            f45970f = arrayList;
            arrayList.add(new r("./."));
            f45970f.add(new r(".."));
            f45970f.add(new r("../."));
            f45970f.add(new r("./.."));
            f45970f.add(new r("././."));
            f45970f.add(new r("..."));
            f45970f.add(new r("../.."));
            f45970f.add(new r("./../.."));
            f45970f.add(new r("../../."));
            f45970f.add(new r("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f45970f.add(new r("../../../.."));
                f45970f.add(new r(".../.../..."));
                f45970f.add(new r("..../..../...."));
                f45970f.add(new r(".../.../.../..."));
            }
        }
        return f45970f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = a2.get(i11);
            i11++;
            i10 = Math.max(i10, ((r) obj).f45974e.size());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return TextUtils.equals(this.f45971a, ((r) obj).f45971a);
        }
        return false;
    }

    public final String toString() {
        return this.f45971a;
    }
}
