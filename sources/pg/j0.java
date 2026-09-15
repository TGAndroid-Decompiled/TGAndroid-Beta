package pg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.n91;
import org.telegram.ui.zr0;
public final class j0 {
    public static final j0 e;
    public static final List f40884f;
    public static final List f40885g;
    public static ArrayList h;
    public static boolean f40886i;
    public final String f40887a;
    public final String f40888b;
    public final String f40889c;
    public final o0.a d;

    static {
        j0 j0Var = new j0("roboto", "PhotoEditorTypefaceRoboto", new o0.a(new zr0(14)));
        e = j0Var;
        f40884f = Arrays.asList(j0Var, new j0("italic", "PhotoEditorTypefaceItalic", new o0.a(new zr0(15))), new j0("serif", "PhotoEditorTypefaceSerif", new o0.a(new zr0(16))), new j0("condensed", "PhotoEditorTypefaceCondensed", new o0.a(new zr0(17))), new j0("mono", "PhotoEditorTypefaceMono", new o0.a(new zr0(18))), new j0("mw_bold", "PhotoEditorTypefaceMerriweather", new o0.a(new zr0(19))));
        f40885g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public j0(String str, String str2, o0.a aVar) {
        this.f40887a = str;
        this.f40888b = str2;
        this.f40889c = null;
        this.d = aVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.j0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f40886i) {
                f40886i = true;
                Utilities.themeQueue.postRunnable(new n91(8));
            }
            return f40884f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, i0 i0Var) {
        Charset charset;
        if (i0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + i0Var.d);
        byte[] bArr = new byte[i0Var.f40880c];
        randomAccessFile.read(bArr);
        if (i0Var.f40878a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        o0.a aVar = this.d;
        if (((Typeface) aVar.f15301c) == null) {
            aVar.f15301c = ((h0) aVar.f15300b).a();
        }
        return (Typeface) aVar.f15301c;
    }

    public j0(Font font, String str) {
        this.f40887a = str;
        this.f40889c = str;
        this.f40888b = null;
        this.d = new o0.a(new k2.v(font, 17));
    }
}
