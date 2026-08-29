package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import i7.h6;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import nh.m6;
import nh.t4;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.wp0;
public final class l extends FrameLayout {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public org.telegram.ui.b0 H;
    public org.telegram.ui.t I;
    public org.telegram.ui.t J;
    public AsyncTask K;
    public final oc.i f44095a;
    public boolean f44096b;
    public final org.telegram.ui.Cells.z f44097c;
    public final FrameLayout d;
    public final FrameLayout f44098e;
    public final ImageView f44099f;
    public final org.telegram.ui.Cells.z h;
    public final ImageView f44100n;
    public final TextView f44101r;
    public final TextView f44102s;
    public final fn v;
    public final d f44103w;
    public final ArrayList f44104x;
    public final j f44105y;

    public l(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.f44104x = new ArrayList();
        this.F = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        t4 t4Var = new t4(this, 6);
        a aVar = new a(this);
        oc.i iVar = new oc.i((c6) null);
        this.f44095a = iVar;
        d dVar = new d(this, activity, i11, t4Var, aVar, iVar);
        this.f44103w = dVar;
        dVar.U2.f29939r = false;
        dVar.setOverScrollMode(2);
        dVar.setPadding(0, 0, 0, 0);
        addView(dVar, f6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f44098e = frameLayout2;
        org.telegram.ui.Cells.z Z = g6.Z(this.C, this.E, 15, 15);
        this.f44097c = Z;
        frameLayout2.setBackground(Z);
        h6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, f6.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f44099f = imageView;
        frameLayout2.addView(imageView, f6.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f44100n = imageView2;
        h6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.z Z2 = g6.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, f6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, f6.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f44101r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, f6.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f44102s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, f6.t(-1, -2, 55, 0, 0, 0, 0));
        this.f44105y = new j(null, i10, new m6(this, 23));
        this.v = new fn(activity, 26);
        int i12 = g6.Pk;
        c(g6.w0(null, i12, false), AndroidUtilities.computePerceivedBrightness(g6.w0(null, i12, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = messageObject.messageText;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(messageObject.messageText);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                    return url;
                }
            }
            return null;
        }
        return null;
    }

    public static void b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("webhistory", 0);
        k kVar = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    k kVar2 = new k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    kVar2.f44085c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(kVar2);
                }
                Collections.sort(arrayList, new wp0(18));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= arrayList.size()) {
                    break;
                }
                k kVar3 = (k) arrayList.get(i11);
                if (TextUtils.equals(kVar3.f44083a, str)) {
                    kVar = kVar3;
                    break;
                }
                i11++;
            } catch (Exception e11) {
                FileLog.e(e11);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (kVar != null) {
            kVar.f44085c += Math.exp((currentTimeMillis - kVar.f44084b) / 2419200.0d);
        } else {
            kVar = new k(str, currentTimeMillis);
            arrayList.add(kVar);
        }
        kVar.f44084b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            k kVar4 = (k) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", kVar4.f44083a);
            jSONObject2.put("rank", kVar4.f44085c);
            jSONObject2.put("usage", kVar4.f44084b);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public final void c(int i10, int i11) {
        float f9;
        if (this.A != i10) {
            this.A = i10;
            invalidate();
        }
        this.D = i11;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        this.C = i0.a.d(AndroidUtilities.lerp(0.05f, 0.12f, f9), i10, i11);
        this.B = i10;
        this.E = i0.a.d(AndroidUtilities.lerp(0.12f, 0.22f, f9), i10, i11);
        int i12 = this.C;
        org.telegram.ui.Cells.z zVar = this.f44097c;
        g6.B1(zVar, i12, false);
        g6.B1(zVar, this.E, true);
        this.f44098e.invalidate();
        this.f44101r.setTextColor(i11);
        this.f44102s.setTextColor(g6.l1(0.6f, i11));
        ImageView imageView = this.f44099f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.f44100n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        g6.B1(this.h, g6.l1(1.5f, this.E), true);
        int v = g6.v(i10, g6.l1(0.05f, i11));
        int v10 = g6.v(i10, g6.l1(0.55f, i11));
        oc.i iVar = this.f44095a;
        SparseIntArray sparseIntArray = (SparseIntArray) iVar.f19483b;
        ((SparseIntArray) iVar.f19483b).put(g6.f23062d6, this.B);
        sparseIntArray.put(g6.G6, i11);
        sparseIntArray.put(g6.f23081e7, v);
        sparseIntArray.put(g6.f23100f7, v10);
        sparseIntArray.put(g6.G8, g6.l1(0.2f, i11));
        sparseIntArray.put(g6.f23152i6, g6.l1(AndroidUtilities.lerp(0.05f, 0.12f, f9), i11));
        this.f44103w.f1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.F);
        canvas.drawColor(this.B);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j jVar = this.f44105y;
        if (jVar != null && this.G) {
            jVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f44105y;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.K;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.K = null;
        }
        ArrayList arrayList = this.f44104x;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            d dVar = this.f44103w;
            dVar.U2.N(true);
            if (z10 != (!arrayList.isEmpty())) {
                dVar.T2.h1(0, 0);
                return;
            }
            return;
        }
        f1 f1Var = new f1(new jh.m6(5, this, z10));
        String str3 = k1.a().f44090c;
        if (str3 != null) {
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str3);
            n10.append(URLEncoder.encode(str));
            str2 = n10.toString();
        }
        this.K = f1Var.execute(str2);
    }

    public void setOpenProgress(float f9) {
        int i10;
        if (Math.abs(this.F - f9) > 1.0E-4f) {
            this.F = f9;
            if (f9 <= 1.0E-4f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (getImportantForAccessibility() != i10) {
                setImportantForAccessibility(i10);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        boolean z11;
        j jVar = this.f44105y;
        if (z10 && jVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.G = z11;
        if (z11) {
            jVar.a();
        }
    }
}
