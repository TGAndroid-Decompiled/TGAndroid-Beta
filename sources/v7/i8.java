package v7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
public abstract class i8 {
    public i8() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i10);

    public abstract Typeface b(Context context, o0.h[] hVarArr, int i10);

    public Typeface c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = j8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!j8.c(inputStream, d)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File d = j8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!j8.b(d, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.h f(o0.h[] hVarArr, int i10) {
        int i11;
        boolean z10;
        int i12;
        new ob.a(10);
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0.h hVar = null;
        int i13 = Integer.MAX_VALUE;
        for (o0.h hVar2 : hVarArr) {
            int abs = Math.abs(hVar2.f15491c - i11) * 2;
            if (hVar2.d == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (hVar == null || i13 > i14) {
                hVar = hVar2;
                i13 = i14;
            }
        }
        return hVar;
    }
}
