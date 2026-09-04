package v7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
public abstract class h8 {
    public h8() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i10);

    public abstract Typeface b(Context context, o0.i[] iVarArr, int i10);

    public Typeface c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = i8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!i8.c(inputStream, d)) {
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
        File d = i8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!i8.b(d, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.i f(o0.i[] iVarArr, int i10) {
        int i11;
        boolean z10;
        int i12;
        new qb.b(10);
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
        o0.i iVar = null;
        int i13 = Integer.MAX_VALUE;
        for (o0.i iVar2 : iVarArr) {
            int abs = Math.abs(iVar2.f16791c - i11) * 2;
            if (iVar2.d == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (iVar == null || i13 > i14) {
                iVar = iVar2;
                i13 = i14;
            }
        }
        return iVar;
    }
}
