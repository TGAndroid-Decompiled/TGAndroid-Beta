package rg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.li1;
import org.telegram.ui.w90;
public final class j0 {
    public static final j0 e;
    public static final List f47472f;
    public static final List f47473g;
    public static ArrayList h;
    public static boolean f47474i;
    public final String f47475a;
    public final String f47476b;
    public final String f47477c;
    public final m4.c d;

    static {
        j0 j0Var = new j0("roboto", "PhotoEditorTypefaceRoboto", new m4.c(new li1(14), 16));
        e = j0Var;
        f47472f = Arrays.asList(j0Var, new j0("italic", "PhotoEditorTypefaceItalic", new m4.c(new li1(15), 16)), new j0("serif", "PhotoEditorTypefaceSerif", new m4.c(new li1(16), 16)), new j0("condensed", "PhotoEditorTypefaceCondensed", new m4.c(new li1(17), 16)), new j0("mono", "PhotoEditorTypefaceMono", new m4.c(new li1(18), 16)), new j0("mw_bold", "PhotoEditorTypefaceMerriweather", new m4.c(new li1(19), 16)));
        f47473g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public j0(String str, String str2, m4.c cVar) {
        this.f47475a = str;
        this.f47476b = str2;
        this.f47477c = null;
        this.d = cVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: rg.j0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f47474i) {
                f47474i = true;
                Utilities.themeQueue.postRunnable(new w90(20));
            }
            return f47472f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, i0 i0Var) {
        Charset charset;
        if (i0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + i0Var.d);
        byte[] bArr = new byte[i0Var.f47468c];
        randomAccessFile.read(bArr);
        if (i0Var.f47466a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        m4.c cVar = this.d;
        if (((Typeface) cVar.f18009c) == null) {
            cVar.f18009c = ((h0) cVar.f18008b).b();
        }
        return (Typeface) cVar.f18009c;
    }

    public j0(Font font, String str) {
        this.f47475a = str;
        this.f47477c = str;
        this.f47476b = null;
        this.d = new m4.c(new org.telegram.ui.Components.voip.j1(font, 5), 16);
    }
}
