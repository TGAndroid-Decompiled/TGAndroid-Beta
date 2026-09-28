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
import org.telegram.ui.l21;
public final class k0 {
    public static final k0 e;
    public static final List f41154f;
    public static final List f41155g;
    public static ArrayList h;
    public static boolean f41156i;
    public final String f41157a;
    public final String f41158b;
    public final String f41159c;
    public final o0.a d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new o0.a(new org.webrtc.audio.b(3)));
        e = k0Var;
        f41154f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new o0.a(new org.webrtc.audio.b(4))), new k0("serif", "PhotoEditorTypefaceSerif", new o0.a(new org.webrtc.audio.b(5))), new k0("condensed", "PhotoEditorTypefaceCondensed", new o0.a(new org.webrtc.audio.b(6))), new k0("mono", "PhotoEditorTypefaceMono", new o0.a(new org.webrtc.audio.b(7))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new o0.a(new org.webrtc.audio.b(8))));
        f41155g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, o0.a aVar) {
        this.f41157a = str;
        this.f41158b = str2;
        this.f41159c = null;
        this.d = aVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f41156i) {
                f41156i = true;
                Utilities.themeQueue.postRunnable(new l21(10));
            }
            return f41154f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f41151c];
        randomAccessFile.read(bArr);
        if (j0Var.f41149a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        o0.a aVar = this.d;
        if (((Typeface) aVar.f15483c) == null) {
            aVar.f15483c = ((i0) aVar.f15482b).a();
        }
        return (Typeface) aVar.f15483c;
    }

    public k0(Font font, String str) {
        this.f41157a = str;
        this.f41159c = str;
        this.f41158b = null;
        this.d = new o0.a(new le.b(font, 17));
    }
}
