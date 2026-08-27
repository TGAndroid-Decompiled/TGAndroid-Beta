package t0;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import gh.q2;
import h3.t0;
import h7.m8;
import j4.x0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import lh.x7;
import m.t;
import n2.b0;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i5;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.hq0;
import org.telegram.ui.ys0;
import r0.j0;
import u3.p;
import v2.m;
import y3.n;
import y3.v;
import y3.w;
import yf.g0;
import yf.r1;
import z8.q;
import zf.a0;
import zf.m2;
import zf.n2;
import zf.o2;
import zf.x1;

public final class c implements f, o8.e, ud.b, z8.d, v, g0, r1, a2, x7, OnSuccessListener, ImageReceiver.ImageReceiverDelegate {

    public final int f47998a;

    public final Object f47999b;

    public c(Object obj, int i10) {
        this.f47998a = i10;
        this.f47999b = obj;
    }

    @Override
    public void A(float f10, int i10) {
        int i11 = this.f47998a;
    }

    @Override
    public Typeface a() {
        return Typeface.createFromFile(((Font) this.f47999b).getFile());
    }

    @Override
    public Object apply(Object obj) {
        p pVar = (p) obj;
        ((u3.i) this.f47999b).getClass();
        return pVar;
    }

    @Override
    public int b(Object obj) {
        t0 t0Var = (t0) this.f47999b;
        n nVar = (n) obj;
        String str = nVar.f49496b;
        return ((str.equals(t0Var.B) || str.equals(w.b(t0Var))) && nVar.c(t0Var, false)) ? 1 : 0;
    }

    public x0 c(u2.b bVar) throws IOException {
        u2.c cVar = (u2.c) this.f47999b;
        URL url = (URL) bVar.f48263c;
        String strC = a.a.c("CctTransportBackend");
        if (Log.isLoggable(strC, 4)) {
            Log.i(strC, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f48269g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) bVar.f48262b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    b0 b0Var = cVar.f48264a;
                    v2.i iVar = (v2.i) bVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    t9.d dVar = (t9.d) b0Var.f18130b;
                    t9.e eVar = new t9.e(bufferedWriter, dVar.f48143a, dVar.f48144b, dVar.f48145c, dVar.d);
                    eVar.h(iVar);
                    eVar.j();
                    eVar.f48147b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strC2 = a.a.c("CctTransportBackend");
                    if (Log.isLoggable(strC2, 4)) {
                        Log.i(strC2, String.format("Status Code: %d", numValueOf));
                    }
                    a.a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    a.a.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new x0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new x0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            x0 x0Var = new x0(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f48728a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return x0Var;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e9) {
            e = e9;
            a.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new x0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            a.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new x0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            a.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new x0(400, null, 0L);
        } catch (r9.b e12) {
            e = e12;
            a.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new x0(400, null, 0L);
        }
    }

    @Override
    public boolean d(j jVar, int i10, Bundle bundle) {
        r0.e dVar;
        t tVar = (t) this.f47999b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f48003a.f();
                Parcelable parcelable = (Parcelable) jVar.f48003a.l();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e9) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e9);
                return false;
            }
        }
        i iVar = jVar.f48003a;
        ClipData clipData = new ClipData(iVar.k(), new ClipData.Item(iVar.c()));
        if (i11 >= 31) {
            dVar = new r0.d(clipData, 2);
        } else {
            r0.f fVar = new r0.f();
            fVar.f46585b = clipData;
            fVar.f46586c = 2;
            dVar = fVar;
        }
        dVar.b(iVar.g());
        dVar.setExtras(bundle);
        return j0.i(tVar, dVar.build()) == null;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi0 lottieAnimation;
        o2 o2Var = (o2) this.f47999b;
        if (!z10 || z11 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        o2Var.q(lottieAnimation);
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f47998a) {
            case 9:
                ((hq0) this.f47999b).run();
                break;
            default:
                ((a0) this.f47999b).f50332a.f50507b2.s();
                break;
        }
    }

    @Override
    public void g() {
        ys0 ys0Var = (ys0) this.f47999b;
        TextView textView = ys0Var.f50533u1;
        boolean zA = ys0Var.B0.a();
        ImageView imageView = ys0Var.f50531s1;
        imageView.animate().cancel();
        imageView.animate().alpha(zA ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(zA);
        textView.animate().cancel();
        textView.animate().alpha(zA ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(zA);
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f47999b, options);
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        switch (this.f47998a) {
            case 3:
                ((Switch) this.f47999b).invalidate();
                break;
            default:
                zg.c.a((zg.c) this.f47999b);
                break;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f47998a;
        Object obj2 = this.f47999b;
        switch (i10) {
            case 12:
                x1 x1Var = (x1) obj2;
                x1Var.f50774y0 = true;
                x1Var.f50773x0 = false;
                break;
            case 13:
                q2 q2Var = (q2) obj2;
                jb.b bVar = (jb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar.f12884a.size(); i11++) {
                    jb.a aVar = (jb.a) bVar.f12884a.get(i11);
                    m2 m2Var = new m2();
                    m2Var.f50574a = aVar.f12880a;
                    m2Var.f50575b = aVar.d;
                    m2Var.f50576c = aVar.f12883e;
                    m2Var.d = aVar.f12881b;
                    m2Var.f50577e = aVar.f12882c;
                    arrayList.add(m2Var);
                }
                q2Var.run(arrayList);
                break;
            default:
                n2 n2Var = (n2) obj2;
                List list = (List) obj;
                n2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                } else {
                    int i12 = ((gb.a) list.get(0)).f6837c;
                    String str = null;
                    if (m8.f8486a == null) {
                        m8.f8486a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i12 >= 0) {
                        String[] strArr = m8.f8486a;
                        if (i12 < strArr.length) {
                            str = strArr[i12];
                        }
                    }
                    n2Var.V = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((gb.a) list.get(0)).f6837c);
                    sb2.append(" ");
                    sb2.append(n2Var.V);
                    sb2.append(" ");
                    pa.v(((gb.a) list.get(0)).f6835a, sb2);
                    Emoji.getEmojiDrawable(n2Var.V);
                }
                break;
        }
    }

    @Override
    public Object u0(af.h hVar) {
        switch (this.f47998a) {
            case 4:
                return new w9.c((Context) hVar.a(Context.class), ((t8.h) hVar.a(t8.h.class)).d(), hVar.y(w9.d.class), hVar.e(ga.b.class), (Executor) hVar.b((q) this.f47999b));
            default:
                return this.f47999b;
        }
    }

    private final void e(float f10, int i10) {
    }

    private final void i(float f10, int i10) {
    }
}
