package qg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ji.m5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.b31;
import org.telegram.ui.ul0;
public final class j0 {
    public static final j0 e;
    public static final List f43457f;
    public static final List f43458g;
    public static ArrayList h;
    public static boolean f43459i;
    public final String f43460a;
    public final String f43461b;
    public final String f43462c;
    public final n6.o d;

    static {
        j0 j0Var = new j0("roboto", "PhotoEditorTypefaceRoboto", new n6.o(new ul0(23)));
        e = j0Var;
        f43457f = Arrays.asList(j0Var, new j0("italic", "PhotoEditorTypefaceItalic", new n6.o(new ul0(24))), new j0("serif", "PhotoEditorTypefaceSerif", new n6.o(new ul0(25))), new j0("condensed", "PhotoEditorTypefaceCondensed", new n6.o(new ul0(26))), new j0("mono", "PhotoEditorTypefaceMono", new n6.o(new ul0(27))), new j0("mw_bold", "PhotoEditorTypefaceMerriweather", new n6.o(new ul0(28))));
        f43458g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public j0(String str, String str2, n6.o oVar) {
        this.f43460a = str;
        this.f43461b = str2;
        this.f43462c = null;
        this.d = oVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: qg.j0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f43459i) {
                f43459i = true;
                Utilities.themeQueue.postRunnable(new b31(13));
            }
            return f43457f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, i0 i0Var) {
        Charset charset;
        if (i0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + i0Var.d);
        byte[] bArr = new byte[i0Var.f43453c];
        randomAccessFile.read(bArr);
        if (i0Var.f43451a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n6.o oVar = this.d;
        if (((Typeface) oVar.f16132c) == null) {
            oVar.f16132c = ((h0) oVar.f16131b).a();
        }
        return (Typeface) oVar.f16132c;
    }

    public j0(Font font, String str) {
        this.f43460a = str;
        this.f43462c = str;
        this.f43461b = null;
        this.d = new n6.o(new m5(font, 21));
    }
}
