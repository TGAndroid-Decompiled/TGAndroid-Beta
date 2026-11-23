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
    public static final a0 f57160e;
    public static final List f57161f;
    public static final List f57162g;
    public static ArrayList h;
    public static boolean f57163i;
    public final String f57164a;
    public final String f57165b;
    public final String f57166c;
    public final ji.k d;

    static {
        a0 a0Var = new a0("roboto", "PhotoEditorTypefaceRoboto", new ji.k(new r0.f1(18), 28));
        f57160e = a0Var;
        f57161f = Arrays.asList(a0Var, new a0("italic", "PhotoEditorTypefaceItalic", new ji.k(new r0.f1(19), 28)), new a0("serif", "PhotoEditorTypefaceSerif", new ji.k(new r0.f1(20), 28)), new a0("condensed", "PhotoEditorTypefaceCondensed", new ji.k(new r0.f1(21), 28)), new a0("mono", "PhotoEditorTypefaceMono", new ji.k(new r0.f1(22), 28)), new a0("mw_bold", "PhotoEditorTypefaceMerriweather", new ji.k(new r0.f1(23), 28)));
        f57162g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public a0(String str, String str2, ji.k kVar) {
        this.f57164a = str;
        this.f57165b = str2;
        this.f57166c = null;
        this.d = kVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f57163i) {
                f57163i = true;
                Utilities.f22777i.c(new cd0(22));
            }
            return f57161f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, z zVar) {
        Charset charset;
        if (zVar == null) {
            return null;
        }
        randomAccessFile.seek(i7 + zVar.d);
        byte[] bArr = new byte[zVar.f57421c];
        randomAccessFile.read(bArr);
        if (zVar.f57419a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        ji.k kVar = this.d;
        if (((Typeface) kVar.f17943c) == null) {
            kVar.f17943c = ((y) kVar.f17942b).a();
        }
        return (Typeface) kVar.f17943c;
    }

    public a0(Font font, String str) {
        this.f57164a = str;
        this.f57166c = str;
        this.f57165b = null;
        this.d = new ji.k(new org.telegram.tgnet.v(font, 23), 28);
    }
}
