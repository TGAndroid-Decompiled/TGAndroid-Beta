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
import org.telegram.ui.ah0;
public final class a0 {
    public static final a0 f56576e;
    public static final List f56577f;
    public static final List f56578g;
    public static ArrayList h;
    public static boolean f56579i;
    public final String f56580a;
    public final String f56581b;
    public final String f56582c;
    public final ji.j d;

    static {
        a0 a0Var = new a0("roboto", "PhotoEditorTypefaceRoboto", new ji.j(new r2.j(17), 28));
        f56576e = a0Var;
        f56577f = Arrays.asList(a0Var, new a0("italic", "PhotoEditorTypefaceItalic", new ji.j(new r2.j(18), 28)), new a0("serif", "PhotoEditorTypefaceSerif", new ji.j(new r2.j(19), 28)), new a0("condensed", "PhotoEditorTypefaceCondensed", new ji.j(new r2.j(20), 28)), new a0("mono", "PhotoEditorTypefaceMono", new ji.j(new r2.j(21), 28)), new a0("mw_bold", "PhotoEditorTypefaceMerriweather", new ji.j(new r2.j(22), 28)));
        f56578g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public a0(String str, String str2, ji.j jVar) {
        this.f56580a = str;
        this.f56581b = str2;
        this.f56582c = null;
        this.d = jVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f56579i) {
                f56579i = true;
                Utilities.f22419i.c(new ah0(19));
            }
            return f56577f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, z zVar) {
        Charset charset;
        if (zVar == null) {
            return null;
        }
        randomAccessFile.seek(i7 + zVar.d);
        byte[] bArr = new byte[zVar.f56837c];
        randomAccessFile.read(bArr);
        if (zVar.f56835a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        ji.j jVar = this.d;
        if (((Typeface) jVar.f17556c) == null) {
            jVar.f17556c = ((y) jVar.f17555b).a();
        }
        return (Typeface) jVar.f17556c;
    }

    public a0(Font font, String str) {
        this.f56580a = str;
        this.f56582c = str;
        this.f56581b = null;
        this.d = new ji.j(new org.telegram.ui.ActionBar.z(font, 21), 28);
    }
}
