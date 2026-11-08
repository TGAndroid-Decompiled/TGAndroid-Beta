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
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.o61;
public final class b0 {
    public static final b0 f55014e;
    public static final List f55015f;
    public static final List f55016g;
    public static ArrayList h;
    public static boolean f55017i;
    public final String f55018a;
    public final String f55019b;
    public final String f55020c;
    public final m4.d0 d;

    static {
        b0 b0Var = new b0("roboto", "PhotoEditorTypefaceRoboto", new m4.d0((Object) new s0.b(10), false));
        f55014e = b0Var;
        f55015f = Arrays.asList(b0Var, new b0("italic", "PhotoEditorTypefaceItalic", new m4.d0((Object) new s0.b(11), false)), new b0("serif", "PhotoEditorTypefaceSerif", new m4.d0((Object) new s0.b(12), false)), new b0("condensed", "PhotoEditorTypefaceCondensed", new m4.d0((Object) new s0.b(13), false)), new b0("mono", "PhotoEditorTypefaceMono", new m4.d0((Object) new s0.b(14), false)), new b0("mw_bold", "PhotoEditorTypefaceMerriweather", new m4.d0((Object) new s0.b(15), false)));
        f55016g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public b0(String str, String str2, m4.d0 d0Var) {
        this.f55018a = str;
        this.f55019b = str2;
        this.f55020c = null;
        this.d = d0Var;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: sg.b0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f55017i) {
                f55017i = true;
                Utilities.f21339i.c(new o61(15));
            }
            return f55015f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, a0 a0Var) {
        Charset charset;
        if (a0Var == null) {
            return null;
        }
        randomAccessFile.seek(i7 + a0Var.d);
        byte[] bArr = new byte[a0Var.f55011c];
        randomAccessFile.read(bArr);
        if (a0Var.f55009a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        m4.d0 d0Var = this.d;
        if (((Typeface) d0Var.f19612b) == null) {
            d0Var.f19612b = ((z) d0Var.f19611a).a();
        }
        return (Typeface) d0Var.f19612b;
    }

    public b0(Font font, String str) {
        this.f55018a = str;
        this.f55020c = str;
        this.f55019b = null;
        this.d = new m4.d0((Object) new m3(font, 16), false);
    }
}
