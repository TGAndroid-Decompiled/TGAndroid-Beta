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
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.q61;
public final class b0 {
    public static final b0 f55025e;
    public static final List f55026f;
    public static final List f55027g;
    public static ArrayList h;
    public static boolean f55028i;
    public final String f55029a;
    public final String f55030b;
    public final String f55031c;
    public final m4.d0 d;

    static {
        b0 b0Var = new b0("roboto", "PhotoEditorTypefaceRoboto", new m4.d0((Object) new s0.b(10), false));
        f55025e = b0Var;
        f55026f = Arrays.asList(b0Var, new b0("italic", "PhotoEditorTypefaceItalic", new m4.d0((Object) new s0.b(11), false)), new b0("serif", "PhotoEditorTypefaceSerif", new m4.d0((Object) new s0.b(12), false)), new b0("condensed", "PhotoEditorTypefaceCondensed", new m4.d0((Object) new s0.b(13), false)), new b0("mono", "PhotoEditorTypefaceMono", new m4.d0((Object) new s0.b(14), false)), new b0("mw_bold", "PhotoEditorTypefaceMerriweather", new m4.d0((Object) new s0.b(15), false)));
        f55027g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public b0(String str, String str2, m4.d0 d0Var) {
        this.f55029a = str;
        this.f55030b = str2;
        this.f55031c = null;
        this.d = d0Var;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: sg.b0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f55028i) {
                f55028i = true;
                Utilities.f21344i.c(new q61(15));
            }
            return f55026f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, a0 a0Var) {
        Charset charset;
        if (a0Var == null) {
            return null;
        }
        randomAccessFile.seek(i7 + a0Var.d);
        byte[] bArr = new byte[a0Var.f55022c];
        randomAccessFile.read(bArr);
        if (a0Var.f55020a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        m4.d0 d0Var = this.d;
        if (((Typeface) d0Var.f19617b) == null) {
            d0Var.f19617b = ((z) d0Var.f19616a).a();
        }
        return (Typeface) d0Var.f19617b;
    }

    public b0(Font font, String str) {
        this.f55029a = str;
        this.f55031c = str;
        this.f55030b = null;
        this.d = new m4.d0((Object) new n3(font, 16), false);
    }
}
