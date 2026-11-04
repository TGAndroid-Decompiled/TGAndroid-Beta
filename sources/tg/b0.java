package tg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.hb1;
public final class b0 {
    public static final b0 f55124e;
    public static final List f55125f;
    public static final List f55126g;
    public static ArrayList h;
    public static boolean f55127i;
    public final String f55128a;
    public final String f55129b;
    public final String f55130c;
    public final mi.h0 d;

    static {
        b0 b0Var = new b0("roboto", "PhotoEditorTypefaceRoboto", new mi.h0(new s0.b(20), 23));
        f55124e = b0Var;
        f55125f = Arrays.asList(b0Var, new b0("italic", "PhotoEditorTypefaceItalic", new mi.h0(new s0.b(21), 23)), new b0("serif", "PhotoEditorTypefaceSerif", new mi.h0(new s0.b(22), 23)), new b0("condensed", "PhotoEditorTypefaceCondensed", new mi.h0(new s0.b(23), 23)), new b0("mono", "PhotoEditorTypefaceMono", new mi.h0(new s0.b(24), 23)), new b0("mw_bold", "PhotoEditorTypefaceMerriweather", new mi.h0(new s0.b(25), 23)));
        f55126g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public b0(String str, String str2, mi.h0 h0Var) {
        this.f55128a = str;
        this.f55129b = str2;
        this.f55130c = null;
        this.d = h0Var;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: tg.b0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f55127i) {
                f55127i = true;
                Utilities.f21390i.c(new hb1(14));
            }
            return f55125f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i3, a0 a0Var) {
        Charset charset;
        if (a0Var == null) {
            return null;
        }
        randomAccessFile.seek(i3 + a0Var.d);
        byte[] bArr = new byte[a0Var.f55120c];
        randomAccessFile.read(bArr);
        if (a0Var.f55118a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        mi.h0 h0Var = this.d;
        if (((Typeface) h0Var.f19645c) == null) {
            h0Var.f19645c = ((z) h0Var.f19644b).a();
        }
        return (Typeface) h0Var.f19645c;
    }

    public b0(Font font, String str) {
        this.f55128a = str;
        this.f55130c = str;
        this.f55129b = null;
        this.d = new mi.h0(new e3(font, 16), 23);
    }
}
