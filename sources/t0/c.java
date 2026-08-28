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
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import fh.v2;
import g7.i8;
import h3.t0;
import j3.r0;
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
import kh.y7;
import m.t;
import n2.p;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g5;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.gq0;
import org.telegram.ui.xs0;
import r0.j0;
import u3.o;
import v2.m;
import xf.g0;
import xf.i0;
import xf.s1;
import y3.n;
import y3.v;
import y3.w;
import y8.r;
import yf.a0;
import yf.m2;
import yf.n2;
import yf.x1;
public final class c implements f, td.b, n8.e, y8.d, g0, v, s1, b2, y7, OnSuccessListener, ImageReceiver.ImageReceiverDelegate {
    public final int f47587a;
    public final Object f47588b;

    public c(Object obj, int i9) {
        this.f47587a = i9;
        this.f47588b = obj;
    }

    @Override
    public void B(float f10, int i9) {
        int i10 = this.f47587a;
    }

    @Override
    public Object H1(b3.b bVar) {
        switch (this.f47587a) {
            case 4:
                return new v9.c((Context) bVar.a(Context.class), ((s8.h) bVar.a(s8.h.class)).d(), bVar.x(v9.d.class), bVar.e(fa.b.class), (Executor) bVar.c((r) this.f47588b));
            default:
                return this.f47588b;
        }
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        switch (this.f47587a) {
            case 1:
                ((Switch) this.f47588b).invalidate();
                return;
            default:
                yg.c.a((yg.c) this.f47588b);
                return;
        }
    }

    @Override
    public Typeface a() {
        return i0.a((Font) this.f47588b);
    }

    @Override
    public Object apply(Object obj) {
        o oVar = (o) obj;
        ((u3.i) this.f47588b).getClass();
        return oVar;
    }

    @Override
    public int b(Object obj) {
        t0 t0Var = (t0) this.f47588b;
        n nVar = (n) obj;
        String str = nVar.f49506b;
        if ((!str.equals(t0Var.B) && !str.equals(w.b(t0Var))) || !nVar.c(t0Var, false)) {
            return 0;
        }
        return 1;
    }

    public x0 c(t5.c cVar) {
        InputStream inputStream;
        u2.b bVar = (u2.b) this.f47588b;
        URL url = (URL) cVar.f47682b;
        String c10 = a.a.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f47972g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.f47683c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                p pVar = bVar.f47967a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                s9.d dVar = (s9.d) pVar.f18343b;
                s9.e eVar = new s9.e(bufferedWriter, dVar.f47494a, dVar.f47495b, dVar.f47496c, dVar.d);
                eVar.h((v2.i) cVar.d);
                eVar.j();
                eVar.f47498b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = a.a.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                a.a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                a.a.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new x0(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        x0 x0Var = new x0(responseCode, null, m.a(new BufferedReader(new InputStreamReader(inputStream))).f48301a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return x0Var;
                    } catch (Throwable th) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new x0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e10) {
            e = e10;
            a.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new x0(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            a.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new x0(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            a.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new x0(400, null, 0L);
        } catch (q9.b e13) {
            e = e13;
            a.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new x0(400, null, 0L);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi0 lottieAnimation;
        n2 n2Var = (n2) this.f47588b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            n2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override
    public void e() {
        float f10;
        xs0 xs0Var = (xs0) this.f47588b;
        TextView textView = xs0Var.f49955u1;
        boolean a2 = xs0Var.B0.a();
        ImageView imageView = xs0Var.f49953s1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a2) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f47587a) {
            case 9:
                ((gq0) this.f47588b).run();
                return;
            default:
                ((a0) this.f47588b).f49737a.f49929b2.r();
                return;
        }
    }

    @Override
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f47588b, options);
    }

    @Override
    public boolean h(j jVar, int i9, Bundle bundle) {
        r0.e eVar;
        t tVar = (t) this.f47588b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i9 & 1) != 0) {
            try {
                jVar.f47592a.f();
                Parcelable parcelable = (Parcelable) jVar.f47592a.k();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        i iVar = jVar.f47592a;
        ClipData clipData = new ClipData(iVar.j(), new ClipData.Item(iVar.c()));
        if (i10 >= 31) {
            eVar = new r0.d(clipData, 2);
        } else {
            r0.f fVar = new r0.f();
            fVar.f46895b = clipData;
            fVar.f46896c = 2;
            eVar = fVar;
        }
        eVar.b(iVar.g());
        eVar.setExtras(bundle);
        if (j0.i(tVar, eVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i9 = this.f47587a;
        Object obj2 = this.f47588b;
        switch (i9) {
            case 12:
                x1 x1Var = (x1) obj2;
                ib.b bVar = (ib.b) obj;
                x1Var.f50179y0 = true;
                x1Var.f50178x0 = false;
                return;
            case 13:
                v2 v2Var = (v2) obj2;
                ib.b bVar2 = (ib.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar2.f11082a.size(); i10++) {
                    ib.a aVar = (ib.a) bVar2.f11082a.get(i10);
                    ?? obj3 = new Object();
                    obj3.f49968a = aVar.f11078a;
                    obj3.f49969b = aVar.d;
                    obj3.f49970c = aVar.f11081e;
                    obj3.d = aVar.f11079b;
                    obj3.f49971e = aVar.f11080c;
                    arrayList.add(obj3);
                }
                v2Var.run(arrayList);
                return;
            default:
                m2 m2Var = (m2) obj2;
                List list = (List) obj;
                m2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i11 = ((fb.a) list.get(0)).f6037c;
                String str = null;
                if (i8.f7250a == null) {
                    i8.f7250a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = i8.f7250a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                m2Var.V = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((fb.a) list.get(0)).f6037c);
                sb2.append(" ");
                sb2.append(m2Var.V);
                sb2.append(" ");
                r0.x(((fb.a) list.get(0)).f6035a, sb2);
                Emoji.getEmojiDrawable(m2Var.V);
                return;
        }
    }

    private final void d(float f10, int i9) {
    }

    private final void i(float f10, int i9) {
    }
}
