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
import ji.w4;
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
import org.telegram.messenger.yh;
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
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.hu0;
import org.telegram.ui.li1;
import org.telegram.ui.or0;
import w7.a6;
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
    public y11 f44400a1;
    public final Paint a2;
    public final FrameLayout f44401b1;
    public final Paint f44402b2;
    public final l0 f44403c1;
    public dh.d f44404c2;
    public final j0 f44405d1;
    public final float[] f44406d2;
    public final FrameLayout f44407e1;
    public final int[] f44408e2;
    public v5 f44409f1;
    public wz f44410f2;
    public int f44411g1;
    public boolean f44412g2;
    public int f44413h1;
    public boolean f44414h2;
    public float f44415i1;
    public boolean f44416i2;
    public ValueAnimator f44417j1;
    public int f44418j2;
    public boolean f44419k1;
    public int f44420k2;
    public final y1 l1;
    public int f44421l2;
    public final w4 f44422m1;
    public int f44423m2;
    public ArrayList f44424n1;
    public boolean f44425n2;
    public final int f44426o1;
    public BigInteger f44427p1;
    public TextView f44428q1;
    public TextView f44429r1;
    public TextView f44430s1;
    public final t1 f44431t1;
    public final q1 f44432u1;
    public final v1 f44433v1;
    public final ImageView f44434w1;
    public final LinearLayout f44435x1;
    public final TextView f44436y1;
    public final TextView f44437z1;

    public o0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, or0 or0Var, c6 c6Var) {
        super(context, activity);
        boolean z10;
        float f7;
        int i12;
        Emoji.EmojiSpan[] emojiSpanArr;
        z1 z1Var;
        ArrayList arrayList2 = arrayList;
        this.f44411g1 = 0;
        this.f44413h1 = -1;
        final hu0 hu0Var = (hu0) this;
        this.f44422m1 = new w4(hu0Var, 24);
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
        this.f44402b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.f44406d2 = new float[2];
        this.f44408e2 = new int[2];
        new m5(hu0Var, 4);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new fh.a(3, c6Var);
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        qg.s0 e = qg.s0.e(i10);
        this.V1 = e;
        e.i(0, true);
        q1Var.f43543a = e.c();
        q1Var.f43545c = e.f43570i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.f44426o1 = i11;
        qg.t1 t1Var = new qg.t1();
        this.F0 = t1Var;
        byte b10 = 2;
        t1Var.f43585a = new ji.m5(hu0Var, 28);
        d0 d0Var = new d0(hu0Var, context, new qg.q0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = d0Var;
        d0Var.setDelegate(new e0(hu0Var, or0Var));
        d0Var.setUndoStore(t1Var);
        d0Var.setQueue(dispatchQueue);
        d0Var.setVisibility(4);
        addView(d0Var, a6.e(-1, -1, 51));
        f0 f0Var = new f0(hu0Var, context);
        this.X0 = f0Var;
        f0Var.setVisibility(4);
        addView(f0Var, a6.e(-1, -1, 51));
        h0 h0Var = new h0(hu0Var, context, new g0(hu0Var));
        this.Z0 = h0Var;
        addView(h0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i13);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    f7 = 2.0f;
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, false);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(false);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    z1Var = i02;
                } else {
                    f7 = 2.0f;
                    if (b11 == 1) {
                        ?? j02 = j0(false);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        int size2 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i14);
                            int i15 = i14 + 1;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            b6 b6Var = new b6(emojiEntity2.document_id, j02.getFontMetricsInt());
                            int i16 = emojiEntity2.offset;
                            spannableString.setSpan(b6Var, i16, emojiEntity2.length + i16, 33);
                            size = size;
                            i14 = i15;
                        }
                        i12 = size;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        j02.setText(replaceEmoji);
                        v0(j02, mediaEntity.textAlign);
                        qg.q1 swatch = j02.getSwatch();
                        swatch.f43543a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        z1Var = j02;
                    } else {
                        i12 = size;
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
                            i13++;
                            arrayList2 = arrayList;
                            size = i12;
                            b10 = 2;
                        }
                    }
                }
                z1Var.setX((mediaEntity.f16731x * this.R0.f26116a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f7));
                z1Var.setY((mediaEntity.f16732y * this.R0.f26117b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f7));
                z1Var.setPosition(new PointF((mediaEntity.viewWidth / f7) + z1Var.getX(), (mediaEntity.viewHeight / f7) + z1Var.getY()));
                z1Var.setScale(mediaEntity.scale);
                z1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i13++;
                arrayList2 = arrayList;
                size = i12;
                b10 = 2;
            }
        }
        this.Z0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.Y0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.f44401b1 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, a6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f44434w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        hu0 hu0Var2 = hu0Var;
                        d0 d0Var2 = hu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            hu0Var2.f44431t1.setSelectedIndex(1);
                            hu0Var2.o((qg.m) qg.m.f43485a.get(0));
                            return;
                        }
                        hu0Var2.F0.c();
                        return;
                    case 1:
                        hu0 hu0Var3 = hu0Var;
                        d0 d0Var3 = hu0Var3.W0;
                        qg.t1 t1Var2 = hu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                hu0Var3.f44431t1.setSelectedIndex(1);
                                hu0Var3.o((qg.m) qg.m.f43485a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43587c.clear();
                            t1Var2.f43586b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.m2(t1Var2, 18));
                            hu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        hu0 hu0Var4 = hu0Var;
                        j jVar = hu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (hu0Var4.f44412g2) {
                            hu0Var4.m0(false);
                        }
                        hu0Var4.r0(hu0Var4.S0);
                        hu0Var4.s0(null, true);
                        return;
                    default:
                        hu0Var.s0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, a6.a(32.0f, 12.0f, 0.0f, 0.0f, 0.0f, 32, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44435x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        yh.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, a6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, a6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(23));
        frameLayout2.addView(linearLayout, a6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f44436y1 = textView2;
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
                        hu0 hu0Var2 = hu0Var;
                        d0 d0Var2 = hu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            hu0Var2.f44431t1.setSelectedIndex(1);
                            hu0Var2.o((qg.m) qg.m.f43485a.get(0));
                            return;
                        }
                        hu0Var2.F0.c();
                        return;
                    case 1:
                        hu0 hu0Var3 = hu0Var;
                        d0 d0Var3 = hu0Var3.W0;
                        qg.t1 t1Var2 = hu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                hu0Var3.f44431t1.setSelectedIndex(1);
                                hu0Var3.o((qg.m) qg.m.f43485a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43587c.clear();
                            t1Var2.f43586b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.m2(t1Var2, 18));
                            hu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        hu0 hu0Var4 = hu0Var;
                        j jVar = hu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (hu0Var4.f44412g2) {
                            hu0Var4.m0(false);
                        }
                        hu0Var4.r0(hu0Var4.S0);
                        hu0Var4.s0(null, true);
                        return;
                    default:
                        hu0Var.s0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout2, textView2, a6.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5), context);
        this.f44437z1 = h;
        h.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.Cells.d0.c(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        hu0 hu0Var2 = hu0Var;
                        d0 d0Var2 = hu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            hu0Var2.f44431t1.setSelectedIndex(1);
                            hu0Var2.o((qg.m) qg.m.f43485a.get(0));
                            return;
                        }
                        hu0Var2.F0.c();
                        return;
                    case 1:
                        hu0 hu0Var3 = hu0Var;
                        d0 d0Var3 = hu0Var3.W0;
                        qg.t1 t1Var2 = hu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                hu0Var3.f44431t1.setSelectedIndex(1);
                                hu0Var3.o((qg.m) qg.m.f43485a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43587c.clear();
                            t1Var2.f43586b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.m2(t1Var2, 18));
                            hu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        hu0 hu0Var4 = hu0Var;
                        j jVar = hu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (hu0Var4.f44412g2) {
                            hu0Var4.m0(false);
                        }
                        hu0Var4.r0(hu0Var4.S0);
                        hu0Var4.s0(null, true);
                        return;
                    default:
                        hu0Var.s0(null, true);
                        return;
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h10 = org.telegram.ui.Cells.d0.h(frameLayout2, h, a6.a(32.0f, 4.0f, 0.0f, 0.0f, 0.0f, -2, 51), context);
        this.A1 = h10;
        h10.setBackground(org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1));
        h10.setPadding(org.telegram.ui.Cells.d0.c(8.0f, R.string.Done, h10), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setGravity(16);
        h10.setTextColor(-1);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setTextSize(1, 16.0f);
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        hu0 hu0Var2 = hu0Var;
                        d0 d0Var2 = hu0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof qg.l)) {
                            d0Var2.b();
                            hu0Var2.f44431t1.setSelectedIndex(1);
                            hu0Var2.o((qg.m) qg.m.f43485a.get(0));
                            return;
                        }
                        hu0Var2.F0.c();
                        return;
                    case 1:
                        hu0 hu0Var3 = hu0Var;
                        d0 d0Var3 = hu0Var3.W0;
                        qg.t1 t1Var2 = hu0Var3.F0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof qg.l)) {
                                d0Var3.b();
                                hu0Var3.f44431t1.setSelectedIndex(1);
                                hu0Var3.o((qg.m) qg.m.f43485a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f43587c.clear();
                            t1Var2.f43586b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.m2(t1Var2, 18));
                            hu0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        hu0 hu0Var4 = hu0Var;
                        j jVar = hu0Var4.S0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (hu0Var4.f44412g2) {
                            hu0Var4.m0(false);
                        }
                        hu0Var4.r0(hu0Var4.S0);
                        hu0Var4.s0(null, true);
                        return;
                    default:
                        hu0Var.s0(null, true);
                        return;
                }
            }
        });
        h10.setAlpha(0.0f);
        h10.setVisibility(8);
        frameLayout2.addView(h10, a6.a(32.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        l0 l0Var = new l0(hu0Var, context);
        this.f44403c1 = l0Var;
        l0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l0Var, a6.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t1 t1Var2 = new t1(context, z10);
        this.f44431t1 = t1Var2;
        t1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t1Var2.setDelegate(this);
        t1Var2.setSelectedIndex(1);
        l0Var.addView(t1Var2, a6.d(48.0f, -1));
        q1 q1Var2 = new q1(context);
        this.f44432u1 = q1Var2;
        q1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        q1Var2.setVisibility(8);
        q1Var2.setDelegate(this);
        q1Var2.setAlignment(qg.s0.e(i10).f43569g);
        l0Var.addView(q1Var2, a6.d(48.0f, -1));
        j0 j0Var = new j0(hu0Var, context);
        this.f44405d1 = j0Var;
        addView(j0Var, a6.d(-1.0f, -1));
        v1 v1Var = new v1(context);
        this.f44433v1 = v1Var;
        v1Var.setVisibility(8);
        v1Var.setOnItemClickListener(new bi.d(hu0Var, 14));
        q1Var2.setTypefaceListView(v1Var);
        j0Var.addView(v1Var, a6.a(-2.0f, 0.0f, 0.0f, 8.0f, 8.0f, -2, 85));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, this.Q1));
        k0 k0Var = new k0(hu0Var, context);
        this.G1 = k0Var;
        k0Var.setVisibility(8);
        k0Var.setColorPalette(qg.s0.e(i10));
        k0Var.setColorListener(new m(hu0Var, 0));
        l0Var.addView(k0Var, a6.a(84.0f, 56.0f, 0.0f, 56.0f, 6.0f, -1, 48));
        setupTabsLayout(context);
        h1 h1Var = new h1(context);
        this.A0 = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        l0Var.addView(h1Var, a6.a(32.0f, 12.0f, 0.0f, 0.0f, 4.0f, 32, 83));
        l1 l1Var = new l1(context);
        this.B0 = l1Var;
        l1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l1Var.setBackground(org.telegram.ui.ActionBar.g6.g0(1090519039, 1, -1));
        l1Var.setOnClickListener(new bi.x(hu0Var, context, bitmap2, 29));
        l0Var.addView(l1Var, a6.a(32.0f, 0.0f, 0.0f, 12.0f, 4.0f, 32, 85));
        y1 y1Var = new y1(context);
        this.l1 = y1Var;
        y1Var.setColorSwatch(this.K1);
        y1Var.setRenderView(this.W0);
        y1Var.setValueOverride(this.f44422m1);
        this.K1.f43545c = this.f44422m1.get();
        y1Var.setOnUpdate(new li1(hu0Var, i10, 8));
        addView(y1Var, a6.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44407e1 = frameLayout3;
        addView(frameLayout3, a6.d(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        t0(this.K1, null);
        o((qg.m) qg.m.f43485a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(hu0 hu0Var, Integer num) {
        hu0Var.setNewColor(num.intValue());
        hu0Var.x0(false);
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
                x2Var.setMaxWidth((int) (o0Var.getPaintingSize().f26116a - 20.0f));
                h0Var.addView(x2Var, a6.d(-2.0f, -2));
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

    public static void c0(hu0 hu0Var, Integer num) {
        qg.s0 s0Var = hu0Var.V1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        hu0Var.setNewColor(num.intValue());
        k0 k0Var = hu0Var.G1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f44411g1 == 2) {
            return this.f44432u1;
        }
        return this.f44431t1;
    }

    private int getFrameRotation() {
        int i10 = this.f44426o1;
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
        iw0Var2.f26116a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        iw0Var2.f26117b = floor;
        if (floor > f7) {
            iw0Var2.f26117b = f7;
            iw0Var2.f26116a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = iw0Var2;
        return iw0Var2;
    }

    public void setNewColor(int i10) {
        qg.q1 q1Var = this.K1;
        int i11 = q1Var.f43543a;
        q1Var.f43543a = i10;
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
        e.f43565a.edit().putInt("text_type", i10).apply();
        this.f44432u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        v5 v5Var = new v5(this, context);
        this.f44409f1 = v5Var;
        v5Var.setClipToPadding(false);
        this.f44409f1.setOrientation(0);
        this.f44403c1.addView(this.f44409f1, a6.a(40.0f, 52.0f, 0.0f, 52.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        this.f44428q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f44428q1;
        int i10 = org.telegram.ui.ActionBar.g6.f19990i6;
        fh.a aVar = this.Q1;
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, aVar), 7, -1));
        this.f44428q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44428q1.setTextColor(-1);
        this.f44428q1.setTextSize(1, 14.0f);
        this.f44428q1.setGravity(1);
        this.f44428q1.setTypeface(AndroidUtilities.bold());
        this.f44428q1.setSingleLine();
        this.f44428q1.setOnClickListener(new k(this, 0));
        this.f44409f1.addView(this.f44428q1, a6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f44429r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f44429r1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, aVar), 7, -1));
        this.f44429r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44429r1.setOnClickListener(new k(this, 1));
        this.f44429r1.setTextColor(-1);
        this.f44429r1.setTextSize(1, 14.0f);
        this.f44429r1.setGravity(1);
        this.f44429r1.setTypeface(AndroidUtilities.bold());
        this.f44429r1.setAlpha(0.6f);
        this.f44429r1.setSingleLine();
        this.f44409f1.addView(this.f44429r1, a6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f44430s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f44430s1.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(i10, aVar), 7, -1));
        this.f44430s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44430s1.setTextColor(-1);
        this.f44430s1.setTextSize(1, 14.0f);
        this.f44430s1.setGravity(1);
        this.f44430s1.setTypeface(AndroidUtilities.bold());
        this.f44430s1.setAlpha(0.6f);
        this.f44430s1.setSingleLine();
        this.f44430s1.setOnClickListener(new k(this, 4));
        this.f44409f1.addView(this.f44430s1, a6.l(1.0f, 0, -2));
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
            lVar.f16474i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16468u = lVar;
            if (z10) {
                v1 v1Var = this.f44433v1;
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
        if (this.f44411g1 != i10 && this.f44413h1 != i10) {
            ValueAnimator valueAnimator = this.f44417j1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f44411g1;
            ViewGroup viewGroup3 = this.f44432u1;
            ViewGroup viewGroup4 = this.f44431t1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f44413h1 = i10;
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
            if (e.f43573l != z10) {
                e.f43573l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f43565a.getInt("brush", 0), false);
                }
            }
            int c10 = qg.s0.e(i12).c();
            qg.q1 q1Var = this.K1;
            q1Var.f43543a = c10;
            t0(q1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f44417j1 = duration;
            duration.setInterpolator(es.f24771f);
            this.f44417j1.addUpdateListener(new l4(this, viewGroup, viewGroup2, 4));
            this.f44417j1.addListener(new w5(this, viewGroup, viewGroup2, i10, 2));
            this.f44417j1.start();
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
                        if (!jVar.f44305l0 && jVar.f44303j0 <= 0.0f) {
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
        if (i10 > AndroidUtilities.dp(50.0f) && this.f44414h2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f44421l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f44421l2).commit();
            } else {
                this.f44420k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f44420k2).commit();
            }
        }
        if (this.f44412g2) {
            if (z10) {
                i11 = this.f44421l2;
            } else {
                i11 = this.f44420k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f44410f2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f44410f2.setLayoutParams(layoutParams);
                this.f44418j2 = layoutParams.height;
                requestLayout();
                h4 h4Var = ((hu0) this).f36960o2.K1;
                if (h4Var != null) {
                    h4Var.a();
                }
                getHeight();
            }
        }
        if (this.f44423m2 == i10 && this.f44425n2 == z10) {
            getHeight();
            return;
        }
        this.f44423m2 = i10;
        this.f44425n2 = z10;
        boolean z13 = this.f44414h2;
        j jVar = this.S0;
        if (jVar instanceof x2) {
            if (((x2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f44414h2 = z12;
        } else {
            this.f44414h2 = false;
        }
        if (this.f44414h2 && this.f44412g2) {
            y0(0);
        }
        if (this.f44418j2 != 0 && !(z11 = this.f44414h2) && z11 != z13 && !this.f44412g2) {
            this.f44418j2 = 0;
            requestLayout();
            h4 h4Var2 = ((hu0) this).f36960o2.K1;
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
            e.f43569g = i10;
            e.f43565a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new t8(26, this, (z1) view)).start();
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        iw0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f26116a / 2.0f;
        float f10 = paintingSize.f26117b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float a2 = (float) org.telegram.messenger.q.a(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f26116a;
            f10 -= a2 * paintingSize.f26117b;
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
        return this.f44427p1.longValue();
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
                tL_inputDocument.f19228id = sticker.f19222id;
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
                                tL_inputDocument2.f19228id = document.f19222id;
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

    public y11 getThanosEffect() {
        if (!y11.c()) {
            return null;
        }
        if (this.f44400a1 == null) {
            y11 y11Var = new y11(getContext(), new n(this, 0));
            this.f44400a1 = y11Var;
            addView(y11Var);
        }
        return this.f44400a1;
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
            float f10 = iw0Var2.f26116a;
            iw0Var2.f26116a = iw0Var2.f26117b;
            iw0Var2.f26117b = f10;
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
        ((hu0) this).f36960o2.f32243g0.isFocusable();
        iw0 paintingSize = getPaintingSize();
        PointF B0 = B0(null);
        x2 x2Var = new x2(getContext(), B0, (int) (paintingSize.f26116a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.f26116a / 9.0f;
        n nVar = new n(this, 2);
        x2Var.f44601w0 = (int) (0.5f * f7);
        x2Var.f44602x0 = (int) (f7 * 2.0f);
        x2Var.f44603y0 = nVar;
        float f10 = B0.x;
        h0 h0Var = this.Z0;
        if (f10 == h0Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (B0.y == h0Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth((int) (paintingSize.f26116a - 20.0f));
        int i10 = this.P1;
        x2Var.setTypeface(qg.s0.e(i10).f43571j);
        x2Var.setType(qg.s0.e(i10).h);
        h0Var.addView(x2Var, a6.d(-2.0f, -2));
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
            int i11 = qg.s0.e(i10).f43569g;
            q1 q1Var = this.f44432u1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(qg.s0.e(i10).h);
        }
        return x2Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.f44406d2;
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
        int[] iArr = this.f44408e2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f7 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f7;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) org.telegram.messenger.q.a(radians, d10, Math.sin(radians) * d));
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
        float measuredHeight = (d0Var.getMeasuredHeight() / 2.0f) + ((float) org.telegram.messenger.q.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        d0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int l0(boolean z10) {
        return this.f44418j2;
    }

    public final void m0(boolean z10) {
        if (this.f44412g2) {
            y0(0);
        }
        if (z10) {
            wz wzVar = this.f44410f2;
            if (wzVar != null && wzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f44410f2.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.f44416i2 = true;
                ofFloat.addListener(new a0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f20554w);
                ofFloat.start();
                return;
            }
            n0();
        }
    }

    public final void n0() {
        wz wzVar;
        h4 h4Var;
        if (this.f44418j2 > 0 && (h4Var = ((hu0) this).f36960o2.K1) != null) {
            h4Var.a();
        }
        if (!this.f44412g2 && (wzVar = this.f44410f2) != null && wzVar.getVisibility() != 8) {
            this.f44410f2.setVisibility(8);
        }
        this.f44418j2 = 0;
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
            this.f44419k1 = true;
        }
        d0Var.setBrush(mVar);
        qg.q1 q1Var = this.K1;
        int i10 = q1Var.f43543a;
        q1Var.f43543a = qg.s0.e(this.P1).c();
        q1Var.f43545c = this.f44422m1.get();
        t0(q1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    public final void o0(boolean z10) {
        int i10;
        int i11;
        if (this.f44411g1 == 0) {
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
            this.f44403c1.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.f44401b1.setLayerType(i12, null);
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
        if (this.f44410f2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f44410f2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f44410f2.getMeasuredHeight();
            }
            wz wzVar = this.f44410f2;
            wzVar.layout(0, R, wzVar.getMeasuredWidth(), this.f44410f2.getMeasuredHeight() + R);
        }
        if (!this.V0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        d0 d0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - d0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + yh.c(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - d0Var.getMeasuredHeight()) / 2, i16);
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        f0 f0Var = this.X0;
        f0Var.layout(ceil, additionalTop, f0Var.getMeasuredWidth() + ceil, f0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = d0Var.getMeasuredWidth();
        h0 h0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - h0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((d0Var.getMeasuredHeight() - h0Var.getMeasuredHeight()) / 2) + additionalTop;
        h0Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        y11 y11Var = this.f44400a1;
        if (y11Var != null) {
            y11Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
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
        float f12 = f10 / this.R0.f26116a;
        this.Q0 = f12;
        h0 h0Var = this.Z0;
        h0Var.setScaleX(f12);
        h0Var.setScaleY(this.Q0);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f26116a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f26117b, 1073741824));
        y11 y11Var = this.f44400a1;
        if (y11Var != null) {
            y11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f26116a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f26117b, 1073741824));
            this.f44400a1.setScaleX(this.Q0);
            this.f44400a1.setScaleY(this.Q0);
        }
        D0();
        this.Y0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.f44403c1, i10, i11);
        measureChild(this.l1, i10, i11);
        measureChild(this.f44407e1, i10, i11);
        measureChild(this.f44405d1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f44418j2), 1073741824));
        FrameLayout frameLayout = this.f44401b1;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.P0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f44412g2 && !this.f44416i2) {
            this.P0 = true;
            n0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            n0();
        }
        wz wzVar = this.f44410f2;
        if (wzVar != null) {
            measureChild(wzVar, i10, i11);
        }
    }

    public final boolean p0() {
        if (this.L1) {
            x0(false);
            return true;
        } else if (this.f44412g2) {
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
                ValueAnimator valueAnimator = this.f44417j1;
                if (valueAnimator != null && this.f44413h1 != 0) {
                    valueAnimator.cancel();
                }
                C0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            qg.t1 t1Var = this.F0;
            t1Var.f43586b.remove(uuid);
            t1Var.f43587c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.m2(t1Var, 18));
        }
        y1 y1Var = this.l1;
        w4 w4Var = this.f44422m1;
        y1Var.setValueOverride(w4Var);
        y1Var.setShowPreview(true);
        float f7 = w4Var.get();
        qg.q1 q1Var = this.K1;
        q1Var.f43545c = f7;
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
        if (z12 && (((i10 = this.f44413h1) == -1 && this.f44411g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f44417j1;
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
            q1 q1Var = this.f44432u1;
            q1Var.setAlignment(i11);
            q1Var.setTypeface(x2Var.getTypeface().f43460a);
            q1Var.e(x2Var.getType(), true);
            this.f44405d1.invalidate();
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
                w2 w2Var = x2Var2.f44595q0;
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
        w4 w4Var = o0Var.f44422m1;
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
                x2Var3.f44604z0 = false;
                x2Var3.getSwatch().f43545c = q1Var2.f43545c;
                t0(x2Var3.getSwatch(), null);
                y1Var.setValueOverride(new di.s5(x2Var3, (int) (o0Var.R0.f26116a / 9.0f), 1));
                y1Var.setShowPreview(false);
                return true;
            }
            y1Var.setValueOverride(w4Var);
            y1Var.setShowPreview(true);
            q1Var2.f43545c = w4Var.get();
            t0(q1Var2, null);
            return true;
        }
        ValueAnimator valueAnimator2 = o0Var.f44417j1;
        if (valueAnimator2 != null && o0Var.f44413h1 != 0) {
            valueAnimator2.cancel();
        }
        if (o0Var.L1) {
            x0(false);
        }
        C0(0);
        y1Var.setValueOverride(w4Var);
        y1Var.setShowPreview(true);
        q1Var2.f43545c = w4Var.get();
        t0(q1Var2, null);
        return z11;
    }

    public void setBlurredBackgroundDrawableForTools(dh.d dVar) {
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f44404c2 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.W1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.f44411g1 == 0) {
            this.l1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.U1 = runnable;
    }

    @Override
    public final void t() {
        h4 h4Var;
        if (!this.f44414h2 && !this.f44412g2) {
            j0(true);
            return;
        }
        boolean z10 = this.f44412g2;
        if (z10 && (h4Var = ((hu0) this).f36960o2.K1) != null) {
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
            q1Var2.f43543a = q1Var.f43543a;
            q1Var2.f43544b = q1Var.f43544b;
            q1Var2.f43545c = q1Var.f43545c;
            int i10 = this.P1;
            qg.s0.e(i10).h(q1Var.f43543a, true);
            qg.s0.e(i10).j(q1Var.f43545c);
        }
        int i11 = q1Var.f43543a;
        d0 d0Var = this.W0;
        d0Var.setColor(i11);
        d0Var.setBrushSize(q1Var.f43545c);
        int i12 = q1Var2.f43543a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new v4(this, num, i12, 2));
            duration.start();
        } else {
            l0 l0Var = this.f44403c1;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        }
        j jVar = this.S0;
        if (jVar instanceof x2) {
            ((x2) jVar).setSwatch(new qg.q1(q1Var.f43544b, q1Var.f43545c, q1Var.f43543a));
        }
    }

    @Override
    public final void u(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) org.telegram.messenger.q.a(radians, d10, Math.sin(radians) * d));
    }

    public final void u0(float f7) {
        this.C0 = f7;
        this.f44401b1.setTranslationY(-f7);
        this.f44403c1.setTranslationY(f7);
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
            float f24 = ((-this.f44418j2) / 2.0f) + f17;
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
            lVar.f16474i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f16468u = lVar;
            if (!this.f44414h2 && !this.f44412g2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.f44403c1.getTranslationY();
            final ViewGroup barView = getBarView();
            this.M1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    o0 o0Var = o0.this;
                    l0 l0Var = o0Var.f44403c1;
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
                    o0Var.f44409f1.setTranslationY(AndroidUtilities.dp(32.0f) * o0Var.N1);
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
                    if (view == o0Var.f44432u1) {
                        o0Var.f44405d1.invalidate();
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
        q1 q1Var = this.f44432u1;
        if (i10 == 1) {
            wz wzVar = this.f44410f2;
            if (wzVar != null && wzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wz wzVar2 = this.f44410f2;
            if (wzVar2 != null && wzVar2.f31014c1 != UserConfig.selectedAccount) {
                removeView(wzVar2);
                this.f44410f2 = null;
            }
            if (this.f44410f2 == null) {
                wz wzVar3 = new wz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
                this.f44410f2 = wzVar3;
                wzVar3.U0 = true;
                wzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f44410f2.setForseMultiwindowLayout(true);
                }
                this.f44410f2.setDelegate(new c0(this));
                addView(this.f44410f2);
            }
            this.f44410f2.setVisibility(0);
            this.f44412g2 = true;
            wz wzVar4 = this.f44410f2;
            if (this.f44420k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f44420k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f44420k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f44421l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f44421l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f44421l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f44421l2;
            } else {
                i11 = this.f44420k2;
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
            this.f44418j2 = i11;
            requestLayout();
            h4 h4Var = ((hu0) this).f36960o2.K1;
            if (h4Var != null) {
                h4Var.a();
            }
            bh emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            getHeight();
            if (!z10 && !this.f44414h2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44418j2, 0.0f);
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
        wz wzVar5 = this.f44410f2;
        if (wzVar5 != null) {
            this.f44412g2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                wzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f44418j2 = 0;
        }
        h4 h4Var2 = ((hu0) this).f36960o2.K1;
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
            m1Var2.f20520b = true;
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
