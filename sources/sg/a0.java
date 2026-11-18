package sg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.cd0;
public final class a0 {
    public static final a0 f57150e;
    public static final List f57151f;
    public static final List f57152g;
    public static ArrayList h;
    public static boolean f57153i;
    public final String f57154a;
    public final String f57155b;
    public final String f57156c;
    public final ji.j d;

    static {
        a0 a0Var = new a0("roboto", "PhotoEditorTypefaceRoboto", new ji.j(new r0.f1(18), 28));
        f57150e = a0Var;
        f57151f = Arrays.asList(a0Var, new a0("italic", "PhotoEditorTypefaceItalic", new ji.j(new r0.f1(19), 28)), new a0("serif", "PhotoEditorTypefaceSerif", new ji.j(new r0.f1(20), 28)), new a0("condensed", "PhotoEditorTypefaceCondensed", new ji.j(new r0.f1(21), 28)), new a0("mono", "PhotoEditorTypefaceMono", new ji.j(new r0.f1(22), 28)), new a0("mw_bold", "PhotoEditorTypefaceMerriweather", new ji.j(new r0.f1(23), 28)));
        f57152g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public a0(String str, String str2, ji.j jVar) {
        this.f57154a = str;
        this.f57155b = str2;
        this.f57156c = null;
        this.d = jVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f57153i) {
                f57153i = true;
                Utilities.f22785i.c(new cd0(22));
            }
            return f57151f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, z zVar) {
        Charset charset;
        if (zVar == null) {
            return null;
        }
        randomAccessFile.seek(i7 + zVar.d);
        byte[] bArr = new byte[zVar.f57411c];
        randomAccessFile.read(bArr);
        if (zVar.f57409a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        ji.j jVar = this.d;
        if (((Typeface) jVar.f17949c) == null) {
            jVar.f17949c = ((y) jVar.f17948b).a();
        }
        return (Typeface) jVar.f17949c;
    }

    public a0(Font font, String str) {
        this.f57154a = str;
        this.f57156c = str;
        this.f57155b = null;
        this.d = new ji.j(new org.telegram.ui.ActionBar.p(font, 22), 28);
    }
}
