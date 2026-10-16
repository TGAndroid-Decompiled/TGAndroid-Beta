package rg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.aa;
import bi.l4;
import com.google.android.gms.internal.play_billing.k3;
import di.b5;
import di.f5;
import di.h4;
import di.h5;
import di.v4;
import di.v5;
import di.w5;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import ji.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.zg;
import org.telegram.ui.gu0;
import org.telegram.ui.mr0;
import w7.z5;
public abstract class o0 extends pw0 implements s1, h, o1, nw0, NotificationCenter.NotificationCenterDelegate {
    public final h1 A0;
    public final TextView A1;
    public final l1 B0;
    public final Paint B1;
    public float C0;
    public final Paint C1;
    public final Bitmap D0;
    public float D1;
    public final Bitmap E0;
    public boolean E1;
    public final qg.t1 F0;
    public o1.k F1;
    public final DispatchQueue G0;
    public final k0 G1;
    public final MediaController.CropState H0;
    public final Paint H1;
    public float I0;
    public final Paint I1;
    public float J0;
    public final Paint J1;
    public float K0;
    public final qg.q1 K1;
    public float L0;
    public boolean L1;
    public float M0;
    public o1.k M1;
    public float N0;
    public float N1;
    public float O0;
    public final Paint O1;
    public boolean P0;
    public final int P1;
    public float Q0;
    public final fh.a Q1;
    public iw0 R0;
    public org.telegram.ui.ActionBar.m1 R1;
    public j S0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout S1;
    public boolean T0;
    public Rect T1;
    public int U0;
    public Runnable U1;
    public final boolean V0;
    public final qg.s0 V1;
    public final d0 W0;
    public boolean W1;
    public final f0 X0;
    public float X1;
    public final i0 Y0;
    public boolean Y1;
    public final h0 Z0;
    public final g6 Z1;
    public z11 f44159a1;
    public final Paint a2;
    public final FrameLayout f44160b1;
    public final Paint f44161b2;
    public final l0 f44162c1;
    public dh.d f44163c2;
    public final j0 f44164d1;
    public final float[] f44165d2;
    public final FrameLayout f44166e1;
    public final int[] f44167e2;
    public v5 f44168f1;
    public wz f44169f2;
    public int f44170g1;
    public boolean f44171g2;
    public int f44172h1;
    public boolean f44173h2;
    public float f44174i1;
    public boolean f44175i2;
    public ValueAnimator f44176j1;
    public int f44177j2;
    public boolean f44178k1;
    public int f44179k2;
    public final y1 l1;
    public int f44180l2;
    public final m.l f44181m1;
    public int f44182m2;
    public ArrayList f44183n1;
    public boolean f44184n2;
    public final int f44185o1;
    public BigInteger f44186p1;
    public TextView f44187q1;
    public TextView f44188r1;
    public TextView f44189s1;
    public final t1 f44190t1;
    public final q1 f44191u1;
    public final v1 f44192v1;
    public final ImageView f44193w1;
    public final LinearLayout f44194x1;
    public final TextView f44195y1;
    public final TextView f44196z1;

    public o0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, mr0 mr0Var, c6 c6Var) {
        super(context, activity);
        boolean z10;
        float f7;
        int i12;
        int i13;
        z1 z1Var;
        Emoji.EmojiSpan[] emojiSpanArr;
        boolean z11 = false;
        this.f44170g1 = 0;
        this.f44172h1 = -1;
        final gu0 gu0Var = (gu0) this;
        this.f44181m1 = new m.l(gu0Var);
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.H1 = new Paint(1);
        this.I1 = new Paint(1);
        this.J1 = new Paint(1);
        qg.q1 q1Var = new qg.q1(1.0f, 0.016773745f, -1);
        this.K1 = q1Var;
        this.O1 = new Paint(1);
        this.Y1 = false;
        this.Z1 = new g6((View) this, 350L, es.h);
        this.a2 = new Paint(1);
        Paint paint = new Paint(1);
        this.f44161b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.f44165d2 = new float[2];
        this.f44167e2 = new int[2];
        new p4.s0(gu0Var, 3);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new fh.a(3, c6Var);
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        qg.s0 e = qg.s0.e(i10);
        this.V1 = e;
        e.i(0, true);
        q1Var.f43285a = e.c();
        q1Var.f43287c = e.f43312i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.f44185o1 = i11;
        qg.t1 t1Var = new qg.t1();
        this.F0 = t1Var;
        t1Var.f43327a = new m5(gu0Var, 28);
        byte b10 = 2;
        d0 d0Var = new d0(gu0Var, context, new qg.q0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = d0Var;
        d0Var.setDelegate(new e0(gu0Var, mr0Var));
        d0Var.setUndoStore(t1Var);
        d0Var.setQueue(dispatchQueue);
        d0Var.setVisibility(4);
        addView(d0Var, z5.e(-1, -1, 51));
        f0 f0Var = new f0(gu0Var, context);
        this.X0 = f0Var;
        f0Var.setVisibility(4);
        addView(f0Var, z5.e(-1, -1, 51));
        h0 h0Var = new h0(gu0Var, context, new g0(gu0Var));
        this.Z0 = h0Var;
        addView(h0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    f7 = 2.0f;
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    i13 = i14;
                    z1Var = i02;
                } else {
                    f7 = 2.0f;
                    if (b11 == 1) {
                        ?? j02 = j0(z11);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        for (int i15 = z11; i15 < size2; i15++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i15);
                            int i16 = size2;
                            b6 b6Var = new b6(emojiEntity.document_id, j02.getFontMetricsInt());
                            int i17 = emojiEntity.offset;
                            spannableString.setSpan(b6Var, i17, emojiEntity.length + i17, 33);
                            size = size;
                            i14 = i14;
                            size2 = i16;
                        }
                        i12 = size;
                        i13 = i14;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        j02.setText(replaceEmoji);
                        v0(j02, mediaEntity.textAlign);
                        qg.q1 swatch = j02.getSwatch();
                        swatch.f43285a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        z1Var = j02;
                    } else {
                        i12 = size;
                        i13 = i14;
                        byte b12 = b10;
                        if (b11 == b12) {
                            z1 h02 = h0(mediaEntity.text, false);
                            h02.B0 = false;
                            if ((mediaEntity.subType & b12) != 0) {
                                h02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            z1Var = h02;
                        } else {
                            i14 = i13 + 1;
                            size = i12;
                            z11 = false;
                            b10 = 2;
                        }
                    }
                }
                z1Var.setX((mediaEntity.f16423x * this.R0.f25809a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f7));
                z1Var.setY((mediaEntity.f16424y * this.R0.f25810b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f7));
                z1Var.setPosition(new PointF((mediaEntity.viewWidth / f7) + z1Var.getX(), (mediaEntity.viewHeight / f7) + z1Var.getY()));
                z1Var.setScale(mediaEntity.scale);
                z1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i14 = i13 + 1;
                size = i12;
                z11 = false;
                b10 = 2;
            }
        }
        this.Z0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.Y0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.f44160b1 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f44193w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gu0 gu0Var2 = gu0Var;
                        d0 d0Var2 = gu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            gu0Var2.f44190t1.setSelectedIndex(1);
                            gu0Var2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        gu0Var2.F0.c();
                        return;
                    case 1:
                        gu0 gu0Var3 = gu0Var;
                        d0 d0Var3 = gu0Var3.W0;
                        qg.t1 t1Var2 = gu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                gu0Var3.f44190t1.setSelectedIndex(1);
                                gu0Var3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            gu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        gu0 gu0Var4 = gu0Var;
                        j jVar = gu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (gu0Var4.f44171g2) {
                            gu0Var4.m0(false);
                        }
                        gu0Var4.r0(gu0Var4.S0);
                        gu0Var4.s0(null, true);
                        return;
                    default:
                        gu0Var.s0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, z5.a(32.0f, 12.0f, 0.0f, 0.0f, 0.0f, 32, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44194x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        sk.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(23));
        frameLayout2.addView(linearLayout, z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f44195y1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gu0 gu0Var2 = gu0Var;
                        d0 d0Var2 = gu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            gu0Var2.f44190t1.setSelectedIndex(1);
                            gu0Var2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        gu0Var2.F0.c();
                        return;
                    case 1:
                        gu0 gu0Var3 = gu0Var;
                        d0 d0Var3 = gu0Var3.W0;
                        qg.t1 t1Var2 = gu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                gu0Var3.f44190t1.setSelectedIndex(1);
                                gu0Var3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            gu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        gu0 gu0Var4 = gu0Var;
                        j jVar = gu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (gu0Var4.f44171g2) {
                            gu0Var4.m0(false);
                        }
                        gu0Var4.r0(gu0Var4.S0);
                        gu0Var4.s0(null, true);
                        return;
                    default:
                        gu0Var.s0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout2, textView2, z5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5), context);
        this.f44196z1 = g10;
        g10.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        g10.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.Clear, g10), 0, AndroidUtilities.dp(8.0f), 0);
        g10.setGravity(16);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextSize(1, 16.0f);
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gu0 gu0Var2 = gu0Var;
                        d0 d0Var2 = gu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            gu0Var2.f44190t1.setSelectedIndex(1);
                            gu0Var2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        gu0Var2.F0.c();
                        return;
                    case 1:
                        gu0 gu0Var3 = gu0Var;
                        d0 d0Var3 = gu0Var3.W0;
                        qg.t1 t1Var2 = gu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                gu0Var3.f44190t1.setSelectedIndex(1);
                                gu0Var3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            gu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        gu0 gu0Var4 = gu0Var;
                        j jVar = gu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (gu0Var4.f44171g2) {
                            gu0Var4.m0(false);
                        }
                        gu0Var4.r0(gu0Var4.S0);
                        gu0Var4.s0(null, true);
                        return;
                    default:
                        gu0Var.s0(null, true);
                        return;
                }
            }
        });
        g10.setAlpha(0.0f);
        g10.setVisibility(8);
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout2, g10, z5.a(32.0f, 4.0f, 0.0f, 0.0f, 0.0f, -2, 51), context);
        this.A1 = g11;
        g11.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        g11.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.Done, g11), 0, AndroidUtilities.dp(8.0f), 0);
        g11.setGravity(16);
        g11.setTextColor(-1);
        g11.setTypeface(AndroidUtilities.bold());
        g11.setTextSize(1, 16.0f);
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gu0 gu0Var2 = gu0Var;
                        d0 d0Var2 = gu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            gu0Var2.f44190t1.setSelectedIndex(1);
                            gu0Var2.o((qg.m) qg.m.f43227a.get(0));
                            return;
                        }
                        gu0Var2.F0.c();
                        return;
                    case 1:
                        gu0 gu0Var3 = gu0Var;
                        d0 d0Var3 = gu0Var3.W0;
                        qg.t1 t1Var2 = gu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                gu0Var3.f44190t1.setSelectedIndex(1);
                                gu0Var3.o((qg.m) qg.m.f43227a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43329c.clear();
                            t1Var2.f43328b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var2, 18));
                            gu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        gu0 gu0Var4 = gu0Var;
                        j jVar = gu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (gu0Var4.f44171g2) {
                            gu0Var4.m0(false);
                        }
                        gu0Var4.r0(gu0Var4.S0);
                        gu0Var4.s0(null, true);
                        return;
                    default:
                        gu0Var.s0(null, true);
                        return;
                }
            }
        });
        g11.setAlpha(0.0f);
        g11.setVisibility(8);
        frameLayout2.addView(g11, z5.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        l0 l0Var = new l0(gu0Var, context);
        this.f44162c1 = l0Var;
        l0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l0Var, z5.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t1 t1Var2 = new t1(context, z10);
        this.f44190t1 = t1Var2;
        t1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t1Var2.setDelegate(this);
        t1Var2.setSelectedIndex(1);
        l0Var.addView(t1Var2, z5.d(48.0f, -1));
        q1 q1Var2 = new q1(context);
        this.f44191u1 = q1Var2;
        q1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        q1Var2.setVisibility(8);
        q1Var2.setDelegate(this);
        q1Var2.setAlignment(qg.s0.e(i10).f43311g);
        l0Var.addView(q1Var2, z5.d(48.0f, -1));
        j0 j0Var = new j0(gu0Var, context);
        this.f44164d1 = j0Var;
        addView(j0Var, z5.d(-1.0f, -1));
        v1 v1Var = new v1(context);
        this.f44192v1 = v1Var;
        v1Var.setVisibility(8);
        v1Var.setOnItemClickListener(new bi.d(gu0Var, 14));
        q1Var2.setTypefaceListView(v1Var);
        j0Var.addView(v1Var, z5.a(-2.0f, 0.0f, 0.0f, 8.0f, 8.0f, -2, 85));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, this.Q1));
        k0 k0Var = new k0(gu0Var, context);
        this.G1 = k0Var;
        k0Var.setVisibility(8);
        k0Var.setColorPalette(qg.s0.e(i10));
        k0Var.setColorListener(new m(gu0Var, 0));
        l0Var.addView(k0Var, z5.a(84.0f, 56.0f, 0.0f, 56.0f, 6.0f, -1, 48));
        setupTabsLayout(context);
        h1 h1Var = new h1(context);
        this.A0 = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        l0Var.addView(h1Var, z5.a(32.0f, 12.0f, 0.0f, 0.0f, 4.0f, 32, 83));
        l1 l1Var = new l1(context);
        this.B0 = l1Var;
        l1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l1Var.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        l1Var.setOnClickListener(new bi.x(gu0Var, context, bitmap2, 29));
        l0Var.addView(l1Var, z5.a(32.0f, 0.0f, 0.0f, 12.0f, 4.0f, 32, 85));
        y1 y1Var = new y1(context);
        this.l1 = y1Var;
        y1Var.setColorSwatch(this.K1);
        y1Var.setRenderView(this.W0);
        y1Var.setValueOverride(this.f44181m1);
        this.K1.f43287c = this.f44181m1.get();
        y1Var.setOnUpdate(new org.telegram.ui.Wallet.i(gu0Var, i10, 7));
        addView(y1Var, z5.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44166e1 = frameLayout3;
        addView(frameLayout3, z5.d(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        t0(this.K1, null);
        o((qg.m) qg.m.f43227a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(gu0 gu0Var, Integer num) {
        gu0Var.setNewColor(num.intValue());
        gu0Var.x0(false);
    }

    public static void a0(rg.o0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: rg.o0.a0(rg.o0):void");
    }

    public static void b0(o0 o0Var) {
        q2 q2Var;
        h0 h0Var = o0Var.Z0;
        j jVar = o0Var.S0;
        if (jVar != null) {
            PointF B0 = o0Var.B0(jVar);
            j jVar2 = o0Var.S0;
            if (jVar2 instanceof q2) {
                q2 q2Var2 = new q2(o0Var.getContext(), (q2) o0Var.S0, B0);
                q2Var2.setDelegate(o0Var);
                h0Var.addView(q2Var2);
                q2Var = q2Var2;
            } else if (jVar2 instanceof x2) {
                x2 x2Var = new x2(o0Var.getContext(), (x2) o0Var.S0, B0);
                x2Var.setDelegate(o0Var);
                x2Var.setMaxWidth((int) (o0Var.getPaintingSize().f25809a - 20.0f));
                h0Var.addView(x2Var, z5.d(-2.0f, -2));
                q2Var = x2Var;
            } else {
                q2Var = null;
            }
            o0Var.q0(q2Var);
            o0Var.s0(q2Var, true);
        }
        org.telegram.ui.ActionBar.m1 m1Var = o0Var.R1;
        if (m1Var != null && m1Var.isShowing()) {
            o0Var.R1.d(true);
        }
    }

    public static void c0(gu0 gu0Var, Integer num) {
        qg.s0 s0Var = gu0Var.V1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        gu0Var.setNewColor(num.intValue());
        k0 k0Var = gu0Var.G1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f44170g1 == 2) {
            return this.f44191u1;
        }
        return this.f44190t1;
    }

    private int getFrameRotation() {
        int i10 = this.f44185o1;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private iw0 getPaintingSize() {
        int i10;
        iw0 iw0Var = this.R0;
        if (iw0Var != null) {
            return iw0Var;
        }
        Bitmap bitmap = this.D0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 2) {
                i10 = 2560;
            } else {
                i10 = 3840;
            }
        } else {
            i10 = 1280;
        }
        iw0 iw0Var2 = new iw0(width, height);
        float f7 = i10;
        iw0Var2.f25809a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        iw0Var2.f25810b = floor;
        if (floor > f7) {
            iw0Var2.f25810b = f7;
            iw0Var2.f25809a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = iw0Var2;
        return iw0Var2;
    }

    public void setNewColor(int i10) {
        qg.q1 q1Var = this.K1;
        int i11 = q1Var.f43285a;
        q1Var.f43285a = i10;
        t0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new b5(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.U0 = i10;
        j jVar = this.S0;
        if (jVar instanceof x2) {
            ((x2) jVar).setType(i10);
        }
        qg.s0 e = qg.s0.e(this.P1);
        e.h = i10;
        e.f43307a.edit().putInt("text_type", i10).apply();
        this.f44191u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        v5 v5Var = new v5(this, context);
        this.f44168f1 = v5Var;
        v5Var.setClipToPadding(false);
        this.f44168f1.setOrientation(0);
        this.f44162c1.addView(this.f44168f1, z5.a(40.0f, 52.0f, 0.0f, 52.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        this.f44187q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f44187q1;
        int i10 = org.telegram.ui.ActionBar.g6.f19690i6;
        fh.a aVar = this.Q1;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, aVar), 7, -1));
        this.f44187q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44187q1.setTextColor(-1);
        this.f44187q1.setTextSize(1, 14.0f);
        this.f44187q1.setGravity(1);
        this.f44187q1.setTypeface(AndroidUtilities.bold());
        this.f44187q1.setSingleLine();
        this.f44187q1.setOnClickListener(new k(this, 0));
        this.f44168f1.addView(this.f44187q1, z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f44188r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f44188r1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, aVar), 7, -1));
        this.f44188r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44188r1.setOnClickListener(new k(this, 1));
        this.f44188r1.setTextColor(-1);
        this.f44188r1.setTextSize(1, 14.0f);
        this.f44188r1.setGravity(1);
        this.f44188r1.setTypeface(AndroidUtilities.bold());
        this.f44188r1.setAlpha(0.6f);
        this.f44188r1.setSingleLine();
        this.f44168f1.addView(this.f44188r1, z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f44189s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f44189s1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, aVar), 7, -1));
        this.f44189s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44189s1.setTextColor(-1);
        this.f44189s1.setTextSize(1, 14.0f);
        this.f44189s1.setGravity(1);
        this.f44189s1.setTypeface(AndroidUtilities.bold());
        this.f44189s1.setAlpha(0.6f);
        this.f44189s1.setSingleLine();
        this.f44189s1.setOnClickListener(new k(this, 4));
        this.f44168f1.addView(this.f44189s1, z5.l(1.0f, 0, -2));
    }

    public static void v0(x2 x2Var, int i10) {
        int i11;
        x2Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 19;
            } else {
                i11 = 21;
            }
        } else {
            i11 = 17;
        }
        x2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        x2Var.getEditText().setTextAlignment(i12);
    }

    @Override
    public final void A() {
        z0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void A0(boolean z10) {
        float f7;
        if (this.E1 != z10) {
            this.E1 = z10;
            o1.k kVar = this.F1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new o1.j(f7));
            this.F1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f16167i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16161u = lVar;
            if (z10) {
                v1 v1Var = this.f44192v1;
                v1Var.setAlpha(0.0f);
                v1Var.setVisibility(0);
            }
            this.F1.b(new aa(3, this));
            this.F1.a(new r(this, z10, 0));
            this.F1.h();
        }
    }

    public final PointF B0(j jVar) {
        float f7 = 200.0f;
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            f7 = 200.0f / cropState.cropScale;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f7, position.y + f7);
        }
        float f10 = 100.0f;
        if (cropState != null) {
            f10 = 100.0f / cropState.cropScale;
        }
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                h0 h0Var = this.Z0;
                if (i10 >= h0Var.getChildCount()) {
                    break;
                }
                View childAt = h0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f7, g02.y + f7);
        }
    }

    public final void C0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.f44170g1 != i10 && this.f44172h1 != i10) {
            ValueAnimator valueAnimator = this.f44176j1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f44170g1;
            ViewGroup viewGroup3 = this.f44191u1;
            ViewGroup viewGroup4 = this.f44190t1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f44172h1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.P1;
            qg.s0 e = qg.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f43315l != z10) {
                e.f43315l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f43307a.getInt("brush", 0), false);
                }
            }
            int c10 = qg.s0.e(i12).c();
            qg.q1 q1Var = this.K1;
            q1Var.f43285a = c10;
            t0(q1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f44176j1 = duration;
            duration.setInterpolator(es.f24465f);
            this.f44176j1.addUpdateListener(new l4(this, viewGroup, viewGroup2, 4));
            this.f44176j1.addListener(new w5(this, viewGroup, viewGroup2, i10, 2));
            this.f44176j1.start();
        }
    }

    @Override
    public final void D() {
        A0(true);
    }

    public final void D0() {
        int i10 = 0;
        while (true) {
            h0 h0Var = this.Z0;
            if (i10 < h0Var.getChildCount()) {
                View childAt = h0Var.getChildAt(i10);
                if (childAt != this.S0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f44064l0 && jVar.f44062j0 <= 0.0f) {
                        }
                    }
                    i10++;
                }
                ((j) childAt).m();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f44173h2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f44180l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f44180l2).commit();
            } else {
                this.f44179k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f44179k2).commit();
            }
        }
        if (this.f44171g2) {
            if (z10) {
                i11 = this.f44180l2;
            } else {
                i11 = this.f44179k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f44169f2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f44169f2.setLayoutParams(layoutParams);
                this.f44177j2 = layoutParams.height;
                requestLayout();
                h4 h4Var = ((gu0) this).f36310o2.K1;
                if (h4Var != null) {
                    h4Var.a();
                }
                getHeight();
            }
        }
        if (this.f44182m2 == i10 && this.f44184n2 == z10) {
            getHeight();
            return;
        }
        this.f44182m2 = i10;
        this.f44184n2 = z10;
        boolean z13 = this.f44173h2;
        j jVar = this.S0;
        if (jVar instanceof x2) {
            if (((x2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f44173h2 = z12;
        } else {
            this.f44173h2 = false;
        }
        if (this.f44173h2 && this.f44171g2) {
            y0(0);
        }
        if (this.f44177j2 != 0 && !(z11 = this.f44173h2) && z11 != z13 && !this.f44171g2) {
            this.f44177j2 = 0;
            requestLayout();
            h4 h4Var2 = ((gu0) this).f36310o2.K1;
            if (h4Var2 != null) {
                h4Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        x0(true);
    }

    @Override
    public final void c() {
        setTextType((this.U0 + 1) % 4);
    }

    @Override
    public final void d() {
        this.O1.setColor(-15132391);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h0 h0Var;
        x2 x2Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (h0Var = this.Z0) != null) {
            for (int i12 = 0; i12 < h0Var.getChildCount(); i12++) {
                View childAt = h0Var.getChildAt(i12);
                if ((childAt instanceof x2) && (str = (x2Var = (x2) childAt).A0) != null) {
                    x2Var.setTypeface(str);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: rg.o0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e(int i10) {
        j jVar = this.S0;
        if (jVar instanceof x2) {
            v0((x2) jVar, i10);
            qg.s0 e = qg.s0.e(this.P1);
            e.f43311g = i10;
            e.f43307a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.v(21, this, (z1) view)).start();
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        iw0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f25809a / 2.0f;
        float f10 = paintingSize.f25810b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float f11 = (float) i2.d.f(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f25809a;
            f10 -= f11 * paintingSize.f25810b;
        }
        return new PointF(f7, f10);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.A0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.B0;
    }

    public long getLcm() {
        return this.f44186p1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        b6[] b6VarArr;
        h0 h0Var = this.Z0;
        int childCount = h0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = h0Var.getChildAt(i10);
            if (childAt instanceof q2) {
                TLRPC.Document sticker = ((q2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f18928id = sticker.f18922id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof x2) {
                CharSequence text = ((x2) childAt).getText();
                if ((text instanceof Spanned) && (b6VarArr = (b6[]) ((Spanned) text).getSpans(0, text.length(), b6.class)) != null) {
                    for (b6 b6Var : b6VarArr) {
                        if (b6Var != null) {
                            TLRPC.Document document = b6Var.document;
                            if (document == null) {
                                document = s5.f(this.P1, b6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f18928id = document.f18922id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return this.C0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public qg.c1 getRenderView() {
        return this.W0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.S0;
        h0 h0Var = this.Z0;
        if (jVar == null) {
            return getY() + h0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (h0Var.getScaleY() * this.S0.getHeight()) + iArr[1];
    }

    public z11 getThanosEffect() {
        if (!z11.c()) {
            return null;
        }
        if (this.f44159a1 == null) {
            z11 z11Var = new z11(getContext(), new n(this, 0));
            this.f44159a1 = z11Var;
            addView(z11Var);
        }
        return this.f44159a1;
    }

    @Override
    public final void h(j jVar) {
        int[] k02 = k0(jVar);
        z0(new t(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final z1 h0(String str, boolean z10) {
        float f7;
        iw0 iw0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        h0 h0Var = this.Z0;
        if (i10 > 0) {
            float floor = (float) Math.floor(h0Var.getMeasuredWidth() * 0.5d);
            iw0Var = new iw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(h0Var.getMeasuredHeight() * 0.5d);
            iw0Var = new iw0(f7 * floor2, floor2);
        }
        iw0 iw0Var2 = iw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = iw0Var2.f25809a;
            iw0Var2.f25809a = iw0Var2.f25810b;
            iw0Var2.f25810b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        z1 z1Var = new z1(context, g02, iw0Var2, str, intValue);
        z1Var.setDelegate(this);
        h0Var.addView(z1Var);
        if (z10) {
            q0(z1Var);
            s0(z1Var, true);
        }
        return z1Var;
    }

    public final rg.z i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: rg.o0.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):rg.z");
    }

    public final x2 j0(boolean z10) {
        ((gu0) this).f36310o2.f31945g0.isFocusable();
        iw0 paintingSize = getPaintingSize();
        PointF B0 = B0(null);
        x2 x2Var = new x2(getContext(), B0, (int) (paintingSize.f25809a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.f25809a / 9.0f;
        n nVar = new n(this, 2);
        x2Var.f44360w0 = (int) (0.5f * f7);
        x2Var.f44361x0 = (int) (f7 * 2.0f);
        x2Var.f44362y0 = nVar;
        float f10 = B0.x;
        h0 h0Var = this.Z0;
        if (f10 == h0Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (B0.y == h0Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth((int) (paintingSize.f25809a - 20.0f));
        int i10 = this.P1;
        x2Var.setTypeface(qg.s0.e(i10).f43313j);
        x2Var.setType(qg.s0.e(i10).h);
        h0Var.addView(x2Var, z5.d(-2.0f, -2));
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            q0(x2Var);
            x2Var.q();
            s0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.T0 = true;
            int i11 = qg.s0.e(i10).f43311g;
            q1 q1Var = this.f44191u1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(qg.s0.e(i10).h);
        }
        return x2Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.f44165d2;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        ViewParent parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.f44167e2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f7 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f7;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) i2.d.f(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean l(MotionEvent motionEvent) {
        if (this.S0 != null) {
            s0(null, true);
        }
        float x10 = motionEvent.getX();
        d0 d0Var = this.W0;
        float translationX = ((x10 - d0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / d0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - d0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / d0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-d0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (d0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (d0Var.getMeasuredHeight() / 2.0f) + ((float) i2.d.f(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        d0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int l0(boolean z10) {
        return this.f44177j2;
    }

    public final void m0(boolean z10) {
        if (this.f44171g2) {
            y0(0);
        }
        if (z10) {
            wz wzVar = this.f44169f2;
            if (wzVar != null && wzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f44169f2.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.f44175i2 = true;
                ofFloat.addListener(new a0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20254w);
                ofFloat.start();
                return;
            }
            n0();
        }
    }

    public final void n0() {
        wz wzVar;
        h4 h4Var;
        if (this.f44177j2 > 0 && (h4Var = ((gu0) this).f36310o2.K1) != null) {
            h4Var.a();
        }
        if (!this.f44171g2 && (wzVar = this.f44169f2) != null && wzVar.getVisibility() != 8) {
            this.f44169f2.setVisibility(8);
        }
        this.f44177j2 = 0;
    }

    @Override
    public final void o(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        y1 y1Var = this.l1;
        if (!z10 && !(mVar instanceof qg.d)) {
            y1Var.b(0.05f, 1.0f);
        } else {
            y1Var.b(0.4f, 1.75f);
        }
        y1Var.setDrawCenter(!(mVar instanceof qg.l));
        d0 d0Var = this.W0;
        if (d0Var.getCurrentBrush() instanceof qg.l) {
            this.f44178k1 = true;
        }
        d0Var.setBrush(mVar);
        qg.q1 q1Var = this.K1;
        int i10 = q1Var.f43285a;
        q1Var.f43285a = qg.s0.e(this.P1).c();
        q1Var.f43287c = this.f44181m1.get();
        t0(q1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    public final void o0(boolean z10) {
        int i10;
        int i11;
        if (this.f44170g1 == 0) {
            int i12 = 0;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.l1.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f44162c1.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.f44160b1.setLayerType(i12, null);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int R;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        if (this.f44169f2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f44169f2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f44169f2.getMeasuredHeight();
            }
            wz wzVar = this.f44169f2;
            wzVar.layout(0, R, wzVar.getMeasuredWidth(), this.f44169f2.getMeasuredHeight() + R);
        }
        if (!this.V0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        d0 d0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - d0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.g0.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - d0Var.getMeasuredHeight()) / 2, i16);
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        f0 f0Var = this.X0;
        f0Var.layout(ceil, additionalTop, f0Var.getMeasuredWidth() + ceil, f0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = d0Var.getMeasuredWidth();
        h0 h0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - h0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((d0Var.getMeasuredHeight() - h0Var.getMeasuredHeight()) / 2) + additionalTop;
        h0Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        z11 z11Var = this.f44159a1;
        if (z11Var != null) {
            z11Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        }
        i0 i0Var = this.Y0;
        i0Var.layout(ceil, additionalTop, i0Var.getMeasuredWidth() + ceil, i0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.P0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.D0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f7 = size;
        }
        float f10 = size;
        float floor = (float) Math.floor((f10 * currentActionBarHeight) / f7);
        float f11 = currentActionBarHeight2;
        if (floor > f11) {
            f10 = (float) Math.floor((f7 * f11) / currentActionBarHeight);
            floor = f11;
        }
        int i12 = (int) f10;
        int i13 = (int) floor;
        this.W0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.X0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f12 = f10 / this.R0.f25809a;
        this.Q0 = f12;
        h0 h0Var = this.Z0;
        h0Var.setScaleX(f12);
        h0Var.setScaleY(this.Q0);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f25809a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f25810b, 1073741824));
        z11 z11Var = this.f44159a1;
        if (z11Var != null) {
            z11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f25809a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f25810b, 1073741824));
            this.f44159a1.setScaleX(this.Q0);
            this.f44159a1.setScaleY(this.Q0);
        }
        D0();
        this.Y0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.f44162c1, i10, i11);
        measureChild(this.l1, i10, i11);
        measureChild(this.f44166e1, i10, i11);
        measureChild(this.f44164d1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f44177j2), 1073741824));
        FrameLayout frameLayout = this.f44160b1;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.P0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f44171g2 && !this.f44175i2) {
            this.P0 = true;
            n0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            n0();
        }
        wz wzVar = this.f44169f2;
        if (wzVar != null) {
            measureChild(wzVar, i10, i11);
        }
    }

    public final boolean p0() {
        if (this.L1) {
            x0(false);
            return true;
        } else if (this.f44171g2) {
            m0(true);
            return true;
        } else if (!this.T0) {
            return false;
        } else {
            s0(null, true);
            return true;
        }
    }

    @Override
    public final boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.F0.b(jVar.getUUID(), new t(this, jVar, 0));
    }

    @Override
    public final boolean r() {
        return !this.T0;
    }

    public final void r0(j jVar) {
        j jVar2 = this.S0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.S0 = null;
            if (jVar instanceof x2) {
                ValueAnimator valueAnimator = this.f44176j1;
                if (valueAnimator != null && this.f44172h1 != 0) {
                    valueAnimator.cancel();
                }
                C0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            qg.t1 t1Var = this.F0;
            t1Var.f43328b.remove(uuid);
            t1Var.f43329c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.r2(t1Var, 18));
        }
        y1 y1Var = this.l1;
        m.l lVar = this.f44181m1;
        y1Var.setValueOverride(lVar);
        y1Var.setShowPreview(true);
        float f7 = lVar.get();
        qg.q1 q1Var = this.K1;
        q1Var.f43287c = f7;
        t0(q1Var, null);
    }

    @Override
    public final void requestLayout() {
        if (this.P0) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s0(j jVar, boolean z10) {
        o0 o0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof x2;
        int i11 = 2;
        if (z12 && (((i10 = this.f44172h1) == -1 && this.f44170g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f44176j1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.L1) {
                x0(false);
            }
            C0(2);
        }
        if (z12 && z10) {
            x2 x2Var = (x2) jVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            q1 q1Var = this.f44191u1;
            q1Var.setAlignment(i11);
            q1Var.setTypeface(x2Var.getTypeface().f43202a);
            q1Var.e(x2Var.getType(), true);
            this.f44164d1.invalidate();
        }
        j jVar2 = this.S0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.T0) {
                    int[] k02 = k0(jVar2);
                    z0(new t(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof x2) {
                    AndroidUtilities.showKeyboard(((x2) jVar2).getFocusedView());
                    m0(false);
                }
                return true;
            }
            o0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = o0Var.S0;
            if (jVar3 instanceof x2) {
                x2 x2Var2 = (x2) jVar3;
                w2 w2Var = x2Var2.f44354q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    o0Var.T0 = false;
                    AndroidUtilities.hideKeyboard(((x2) o0Var.S0).getFocusedView());
                    m0(false);
                }
            }
            z11 = true;
        } else {
            o0Var = this;
            z11 = false;
        }
        j jVar4 = o0Var.S0;
        o0Var.S0 = jVar;
        if ((jVar4 instanceof x2) && TextUtils.isEmpty(((x2) jVar4).getText())) {
            r0(jVar4);
        }
        j jVar5 = o0Var.S0;
        m.l lVar = o0Var.f44181m1;
        qg.q1 q1Var2 = o0Var.K1;
        y1 y1Var = o0Var.l1;
        if (jVar5 != null) {
            i0 i0Var = o0Var.Y0;
            jVar5.m0 = i0Var;
            jVar5.l(i0Var, true);
            o0Var.Z0.bringChildToFront(o0Var.S0);
            j jVar6 = o0Var.S0;
            if (jVar6 instanceof x2) {
                x2 x2Var3 = (x2) jVar6;
                x2Var3.f44363z0 = false;
                x2Var3.getSwatch().f43287c = q1Var2.f43287c;
                t0(x2Var3.getSwatch(), null);
                y1Var.setValueOverride(new di.s5(x2Var3, (int) (o0Var.R0.f25809a / 9.0f), 1));
                y1Var.setShowPreview(false);
                return true;
            }
            y1Var.setValueOverride(lVar);
            y1Var.setShowPreview(true);
            q1Var2.f43287c = lVar.get();
            t0(q1Var2, null);
            return true;
        }
        ValueAnimator valueAnimator2 = o0Var.f44176j1;
        if (valueAnimator2 != null && o0Var.f44172h1 != 0) {
            valueAnimator2.cancel();
        }
        if (o0Var.L1) {
            x0(false);
        }
        C0(0);
        y1Var.setValueOverride(lVar);
        y1Var.setShowPreview(true);
        q1Var2.f43287c = lVar.get();
        t0(q1Var2, null);
        return z11;
    }

    public void setBlurredBackgroundDrawableForTools(dh.d dVar) {
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f44163c2 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.W1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.f44170g1 == 0) {
            this.l1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.U1 = runnable;
    }

    @Override
    public final void t() {
        h4 h4Var;
        if (!this.f44173h2 && !this.f44171g2) {
            j0(true);
            return;
        }
        boolean z10 = this.f44171g2;
        if (z10 && (h4Var = ((gu0) this).f36310o2.K1) != null) {
            h4Var.e = true;
        }
        y0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.S0;
            if (jVar instanceof x2) {
                AndroidUtilities.showKeyboard(((x2) jVar).getEditText());
            }
        }
    }

    public final void t0(qg.q1 q1Var, Integer num) {
        qg.q1 q1Var2 = this.K1;
        if (q1Var2 != q1Var) {
            q1Var2.f43285a = q1Var.f43285a;
            q1Var2.f43286b = q1Var.f43286b;
            q1Var2.f43287c = q1Var.f43287c;
            int i10 = this.P1;
            qg.s0.e(i10).h(q1Var.f43285a, true);
            qg.s0.e(i10).j(q1Var.f43287c);
        }
        int i11 = q1Var.f43285a;
        d0 d0Var = this.W0;
        d0Var.setColor(i11);
        d0Var.setBrushSize(q1Var.f43287c);
        int i12 = q1Var2.f43285a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new v4(this, num, i12, 2));
            duration.start();
        } else {
            l0 l0Var = this.f44162c1;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        }
        j jVar = this.S0;
        if (jVar instanceof x2) {
            ((x2) jVar).setSwatch(new qg.q1(q1Var.f43286b, q1Var.f43287c, q1Var.f43285a));
        }
    }

    @Override
    public final void u(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) i2.d.f(radians, d10, Math.sin(radians) * d));
    }

    public final void u0(float f7) {
        this.C0 = f7;
        this.f44160b1.setTranslationY(-f7);
        this.f44162c1.setTranslationY(f7);
    }

    @Override
    public final boolean v(j jVar) {
        return s0(jVar, true);
    }

    @Override
    public final int[] w(j jVar) {
        return k0(jVar);
    }

    public final void w0(float f7, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        this.I0 = f7;
        this.N0 = f12;
        this.O0 = f13;
        this.J0 = f10;
        this.K0 = f11;
        this.L0 = f10;
        float f21 = f11 + 0.0f;
        this.M0 = f21;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                view = this.Z0;
            } else if (i10 == 1) {
                view = this.Y0;
            } else if (i10 == 2) {
                view = this.W0;
            } else {
                view = this.X0;
            }
            MediaController.CropState cropState = this.H0;
            if (cropState != null) {
                float f22 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i11 = cropState.transformRotation;
                    if (i11 == 90 || i11 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f12 / ((int) (cropState.cropPw * f19)), f13 / ((int) (cropState.cropPh * f20)));
                    f15 = f22 * max;
                    float C = k3.C(cropState.cropPx, measuredWidth, f7, max);
                    float f23 = cropState.cropScale;
                    f16 = (C * f23) + f10;
                    f14 = 1.0f;
                    f17 = (cropState.cropPy * measuredHeight * f7 * max * f23) + f21;
                    f18 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                f14 = 1.0f;
                if (i10 == 0) {
                    f15 = this.Q0 * 1.0f;
                } else {
                    f15 = 1.0f;
                }
                f16 = f10;
                f17 = f21;
                f18 = 0.0f;
            }
            float f24 = ((-this.f44177j2) / 2.0f) + f17;
            float f25 = f7 * f15;
            if (Float.isNaN(f25)) {
                f25 = f14;
            }
            view.setScaleX(f25);
            view.setScaleY(f25);
            view.setTranslationX(f16);
            view.setTranslationY(f24);
            view.setRotation(f18);
            view.invalidate();
        }
        D0();
        invalidate();
    }

    @Override
    public final qg.s0 x() {
        return qg.s0.e(this.P1);
    }

    public final void x0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.L1 != z10) {
            this.L1 = z10;
            o1.k kVar = this.M1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new o1.j(f7));
            this.M1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f16167i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16161u = lVar;
            if (!this.f44173h2 && !this.f44171g2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.f44162c1.getTranslationY();
            final ViewGroup barView = getBarView();
            this.M1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    o0 o0Var = o0.this;
                    l0 l0Var = o0Var.f44162c1;
                    float f13 = f11 / 1000.0f;
                    o0Var.N1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(o0Var.N1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(o0Var.N1, 0.25f) / 0.25f));
                    k0 k0Var = o0Var.G1;
                    float f15 = o0Var.N1;
                    boolean z12 = z10;
                    k0Var.z1(f15, z12);
                    o0Var.B0.setProgress(o0Var.N1);
                    o0Var.A0.setProgress(o0Var.N1);
                    o0Var.f44168f1.setTranslationY(AndroidUtilities.dp(32.0f) * o0Var.N1);
                    if (zArr[0]) {
                        float f16 = o0Var.N1;
                        if (!z12) {
                            f16 = 1.0f - f16;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f16;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        l0Var.setTranslationY(translationY - (dp * i10));
                    }
                    l0Var.invalidate();
                    if (view == o0Var.f44191u1) {
                        o0Var.f44164d1.invalidate();
                    }
                }
            });
            this.M1.a(new r(this, z10, 1));
            this.M1.h();
            if (z10) {
                k0 k0Var = this.G1;
                k0Var.setVisibility(0);
                k0Var.setSelectedColorIndex(qg.s0.e(this.P1).d());
            }
        }
    }

    public final void y0(int i10) {
        boolean z10;
        int i11;
        q1 q1Var = this.f44191u1;
        if (i10 == 1) {
            wz wzVar = this.f44169f2;
            if (wzVar != null && wzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wz wzVar2 = this.f44169f2;
            if (wzVar2 != null && wzVar2.f30707c1 != UserConfig.selectedAccount) {
                removeView(wzVar2);
                this.f44169f2 = null;
            }
            if (this.f44169f2 == null) {
                wz wzVar3 = new wz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
                this.f44169f2 = wzVar3;
                wzVar3.U0 = true;
                wzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f44169f2.setForseMultiwindowLayout(true);
                }
                this.f44169f2.setDelegate(new c0(this));
                addView(this.f44169f2);
            }
            this.f44169f2.setVisibility(0);
            this.f44171g2 = true;
            wz wzVar4 = this.f44169f2;
            if (this.f44179k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f44179k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f44179k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f44180l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f44180l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f44180l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f44180l2;
            } else {
                i11 = this.f44179k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wzVar4.getLayoutParams();
            layoutParams.height = i11;
            wzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.S0;
                if (jVar instanceof x2) {
                    AndroidUtilities.hideKeyboard(((x2) jVar).getEditText());
                }
            }
            this.f44177j2 = i11;
            requestLayout();
            h4 h4Var = ((gu0) this).f36310o2.K1;
            if (h4Var != null) {
                h4Var.a();
            }
            bh emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            getHeight();
            if (!z10 && !this.f44173h2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44177j2, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new a0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        bh emojiButton2 = q1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(zg.e, true);
        }
        wz wzVar5 = this.f44169f2;
        if (wzVar5 != null) {
            this.f44171g2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                wzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f44177j2 = 0;
        }
        h4 h4Var2 = ((gu0) this).f36310o2.K1;
        if (h4Var2 != null) {
            h4Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void z0(Runnable runnable, o0 o0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.m1 m1Var = this.R1;
        if (m1Var != null && m1Var.isShowing()) {
            this.R1.d(true);
            return;
        }
        if (this.S1 == null) {
            this.T1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.Q1);
            this.S1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.S1.setBackgroundColor(-14145495);
            this.S1.setOnTouchListener(new f5(this, 1));
            this.S1.setDispatchKeyEventListener(new q(this));
            this.S1.setShownFromBottom(true);
        }
        this.S1.d();
        runnable.run();
        if (this.R1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.S1, -2, -2);
            this.R1 = m1Var2;
            m1Var2.f20220b = true;
            m1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.R1.setOutsideTouchable(true);
            this.R1.setClippingEnabled(true);
            this.R1.setInputMethodMode(2);
            this.R1.setSoftInputMode(0);
            this.R1.getContentView().setFocusableInTouchMode(true);
            this.R1.setOnDismissListener(new h5(this, 1));
        }
        this.S1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.R1.setFocusable(true);
        this.R1.showAtLocation(o0Var, i10, i11 - (this.S1.getMeasuredWidth() / 2), i12 - this.S1.getMeasuredHeight());
        org.telegram.ui.ActionBar.m1.i(this.S1);
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public final void g(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m(boolean z10) {
    }

    @Override
    public final void y() {
    }
}
