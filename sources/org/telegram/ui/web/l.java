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
import bi.t8;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.vn;
import org.telegram.ui.bv;
public final class l extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public org.telegram.ui.y L;
    public org.telegram.ui.q M;
    public org.telegram.ui.q N;
    public AsyncTask O;
    public final h5 f45296a;
    public boolean f45297b;
    public final org.telegram.ui.Cells.y f45298c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f45299f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView f45300n;
    public final TextView f45301r;
    public final TextView f45302s;
    public final vn v;
    public final d f45303w;
    public final ArrayList f45304x;
    public final j f45305y;

    public l(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.f45304x = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        hi.e2 e2Var = new hi.e2(this, 20);
        a aVar = new a(this);
        h5 h5Var = new h5(null);
        this.f45296a = h5Var;
        d dVar = new d(this, activity, i11, e2Var, aVar, h5Var);
        this.f45303w = dVar;
        dVar.f32150g3.f29505r = false;
        dVar.setOverScrollMode(2);
        dVar.setPadding(0, 0, 0, 0);
        addView(dVar, gb1.i(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.y a02 = y6.a0(this.G, this.I, 15, 15);
        this.f45298c = a02;
        frameLayout2.setBackground(a02);
        gb1.c(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, gb1.h(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f45299f = imageView;
        frameLayout2.addView(imageView, gb1.h(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f45300n = imageView2;
        gb1.b(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.y a03 = y6.a0(0, 0, 6, 6);
        this.h = a03;
        imageView2.setBackground(a03);
        frameLayout2.addView(imageView2, gb1.h(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, gb1.h(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f45301r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, gb1.x(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f45302s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, gb1.x(-1, -2, 55, 0, 0, 0, 0));
        this.f45305y = new j(null, i10, new k2.c(this, 25));
        this.v = new vn(activity, 28);
        int i12 = y6.Pk;
        c(y6.x0(null, i12, false), AndroidUtilities.computePerceivedBrightness(y6.x0(null, i12, false)) >= 0.721f ? -16777216 : -1);
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
                    kVar2.f45290c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(kVar2);
                }
                Collections.sort(arrayList, new bv(17));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= arrayList.size()) {
                    break;
                }
                k kVar3 = (k) arrayList.get(i11);
                if (TextUtils.equals(kVar3.f45288a, str)) {
                    kVar = kVar3;
                    break;
                }
                i11++;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (kVar != null) {
            kVar.f45290c += Math.exp((currentTimeMillis - kVar.f45289b) / 2419200.0d);
        } else {
            kVar = new k(str, currentTimeMillis);
            arrayList.add(kVar);
        }
        kVar.f45289b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            k kVar4 = (k) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", kVar4.f45288a);
            jSONObject2.put("rank", kVar4.f45290c);
            jSONObject2.put("usage", kVar4.f45289b);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public final void c(int i10, int i11) {
        float f7;
        if (this.E != i10) {
            this.E = i10;
            invalidate();
        }
        this.H = i11;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.G = i0.a.f(AndroidUtilities.lerp(0.05f, 0.12f, f7), i10, i11);
        this.F = i10;
        this.I = i0.a.f(AndroidUtilities.lerp(0.12f, 0.22f, f7), i10, i11);
        int i12 = this.G;
        org.telegram.ui.Cells.y yVar = this.f45298c;
        y6.E1(yVar, i12, false);
        y6.E1(yVar, this.I, true);
        this.e.invalidate();
        this.f45301r.setTextColor(i11);
        this.f45302s.setTextColor(y6.o1(0.6f, i11));
        ImageView imageView = this.f45299f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.f45300n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        y6.E1(this.h, y6.o1(1.5f, this.I), true);
        int v = y6.v(i10, y6.o1(0.05f, i11));
        int v10 = y6.v(i10, y6.o1(0.55f, i11));
        h5 h5Var = this.f45296a;
        SparseIntArray sparseIntArray = h5Var.f22686b;
        SparseIntArray sparseIntArray2 = h5Var.f22686b;
        sparseIntArray.put(y6.f23354d6, this.F);
        sparseIntArray2.put(y6.G6, i11);
        sparseIntArray2.put(y6.f23374e7, v);
        sparseIntArray2.put(y6.f7, v10);
        sparseIntArray2.put(y6.G8, y6.o1(0.2f, i11));
        sparseIntArray2.put(y6.f23446i6, y6.o1(AndroidUtilities.lerp(0.05f, 0.12f, f7), i11));
        this.f45303w.g1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.J);
        canvas.drawColor(this.F);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j jVar = this.f45305y;
        if (jVar != null && this.K) {
            jVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f45305y;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.O;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        ArrayList arrayList = this.f45304x;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            d dVar = this.f45303w;
            dVar.f32150g3.O(true);
            if (z10 != (!arrayList.isEmpty())) {
                dVar.f32149f3.h1(0, 0);
                return;
            }
            return;
        }
        i1 i1Var = new i1(new t8(9, this, z10));
        String str3 = n1.a().f45331c;
        if (str3 != null) {
            StringBuilder u10 = a1.g.u(str3);
            u10.append(URLEncoder.encode(str));
            str2 = u10.toString();
        }
        this.O = i1Var.execute(str2);
    }

    public void setOpenProgress(float f7) {
        int i10;
        if (Math.abs(this.J - f7) > 1.0E-4f) {
            this.J = f7;
            if (f7 <= 1.0E-4f) {
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
        j jVar = this.f45305y;
        if (z10 && jVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        if (z11) {
            jVar.a();
        }
    }
}
