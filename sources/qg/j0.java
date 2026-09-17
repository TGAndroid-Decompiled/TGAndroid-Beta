package qg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ji.k5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.q31;
import org.telegram.ui.sw0;
public final class j0 {
    public static final j0 f44451e;
    public static final List f44452f;
    public static final List f44453g;
    public static ArrayList h;
    public static boolean f44454i;
    public final String f44455a;
    public final String f44456b;
    public final String f44457c;
    public final n7.z0 d;

    static {
        j0 j0Var = new j0("roboto", "PhotoEditorTypefaceRoboto", new n7.z0(new sw0(17)));
        f44451e = j0Var;
        f44452f = Arrays.asList(j0Var, new j0("italic", "PhotoEditorTypefaceItalic", new n7.z0(new sw0(18))), new j0("serif", "PhotoEditorTypefaceSerif", new n7.z0(new sw0(19))), new j0("condensed", "PhotoEditorTypefaceCondensed", new n7.z0(new sw0(20))), new j0("mono", "PhotoEditorTypefaceMono", new n7.z0(new sw0(21))), new j0("mw_bold", "PhotoEditorTypefaceMerriweather", new n7.z0(new sw0(22))));
        f44453g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public j0(String str, String str2, n7.z0 z0Var) {
        this.f44455a = str;
        this.f44456b = str2;
        this.f44457c = null;
        this.d = z0Var;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: qg.j0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f44454i) {
                f44454i = true;
                Utilities.themeQueue.postRunnable(new q31(9));
            }
            return f44452f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, i0 i0Var) {
        Charset charset;
        if (i0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + i0Var.d);
        byte[] bArr = new byte[i0Var.f44447c];
        randomAccessFile.read(bArr);
        if (i0Var.f44445a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n7.z0 z0Var = this.d;
        if (((Typeface) z0Var.f16704c) == null) {
            z0Var.f16704c = ((h0) z0Var.f16703b).a();
        }
        return (Typeface) z0Var.f16704c;
    }

    public j0(Font font, String str) {
        this.f44455a = str;
        this.f44457c = str;
        this.f44456b = null;
        this.d = new n7.z0(new k5(font, 17));
    }
}
