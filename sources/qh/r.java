package qh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
public final class r {
    public static ArrayList f45923f;
    public final String f45924a;
    public final int f45925b;
    public final int f45926c;
    public final int[] d;
    public final ArrayList f45927e = new ArrayList();

    public r(String str) {
        str = str == null ? "." : str;
        this.f45924a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f45926c = length;
        this.d = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < split.length; i11++) {
            this.d[i11] = split[i11].length();
            i10 = Math.max(i10, split[i11].length());
        }
        this.f45925b = i10;
        for (int i12 = 0; i12 < split.length; i12++) {
            for (int i13 = 0; i13 < split[i12].length(); i13++) {
                this.f45927e.add(new q(this, i13, i12));
            }
        }
    }

    public static ArrayList a() {
        if (f45923f == null) {
            ArrayList arrayList = new ArrayList();
            f45923f = arrayList;
            arrayList.add(new r("./."));
            f45923f.add(new r(".."));
            f45923f.add(new r("../."));
            f45923f.add(new r("./.."));
            f45923f.add(new r("././."));
            f45923f.add(new r("..."));
            f45923f.add(new r("../.."));
            f45923f.add(new r("./../.."));
            f45923f.add(new r("../../."));
            f45923f.add(new r("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f45923f.add(new r("../../../.."));
                f45923f.add(new r(".../.../..."));
                f45923f.add(new r("..../..../...."));
                f45923f.add(new r(".../.../.../..."));
            }
        }
        return f45923f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = a2.get(i11);
            i11++;
            i10 = Math.max(i10, ((r) obj).f45927e.size());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return TextUtils.equals(this.f45924a, ((r) obj).f45924a);
        }
        return false;
    }

    public final String toString() {
        return this.f45924a;
    }
}
