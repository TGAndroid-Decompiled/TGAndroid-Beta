package pg;

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
import bi.b5;
import bi.d5;
import bi.i6;
import bi.s5;
import bi.s6;
import bi.v5;
import bi.w6;
import bi.x6;
import bi.z5;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m.g3;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zd;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.ir0;
import org.telegram.ui.zt0;
import w7.a6;
public abstract class m0 extends bw0 implements q1, h, m1, zv0, NotificationCenter.NotificationCenterDelegate {
    public final f1 A0;
    public final TextView A1;
    public final j1 B0;
    public final Paint B1;
    public float C0;
    public final Paint C1;
    public final Bitmap D0;
    public float D1;
    public final Bitmap E0;
    public boolean E1;
    public final og.y1 F0;
    public o1.k F1;
    public final DispatchQueue G0;
    public final j0 G1;
    public final MediaController.CropState H0;
    public final Paint H1;
    public float I0;
    public final Paint I1;
    public float J0;
    public final Paint J1;
    public float K0;
    public final og.v1 K1;
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
    public final dh.b Q1;
    public tv0 R0;
    public org.telegram.ui.ActionBar.p1 R1;
    public j S0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout S1;
    public boolean T0;
    public Rect T1;
    public int U0;
    public Runnable U1;
    public final boolean V0;
    public final og.x0 V1;
    public final c0 W0;
    public boolean W1;
    public final e0 X0;
    public float X1;
    public final h0 Y0;
    public boolean Y1;
    public final g0 Z0;
    public final d6 Z1;
    public k11 f40123a1;
    public final Paint a2;
    public final FrameLayout f40124b1;
    public final Paint f40125b2;
    public final k0 f40126c1;
    public bh.d f40127c2;
    public final i0 f40128d1;
    public final float[] f40129d2;
    public final FrameLayout f40130e1;
    public final int[] f40131e2;
    public w6 f40132f1;
    public rz f40133f2;
    public int f40134g1;
    public boolean f40135g2;
    public int f40136h1;
    public boolean f40137h2;
    public float f40138i1;
    public boolean f40139i2;
    public ValueAnimator f40140j1;
    public int f40141j2;
    public boolean f40142k1;
    public int f40143k2;
    public final w1 l1;
    public int f40144l2;
    public final g3 f40145m1;
    public int f40146m2;
    public ArrayList f40147n1;
    public boolean f40148n2;
    public final int f40149o1;
    public BigInteger f40150p1;
    public TextView f40151q1;
    public TextView f40152r1;
    public TextView f40153s1;
    public final r1 f40154t1;
    public final o1 f40155u1;
    public final t1 f40156v1;
    public final ImageView f40157w1;
    public final LinearLayout f40158x1;
    public final TextView f40159y1;
    public final TextView f40160z1;

    public m0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ir0 ir0Var, f6 f6Var) {
        super(context, activity);
        boolean z10;
        int i12;
        Emoji.EmojiSpan[] emojiSpanArr;
        x1 x1Var;
        boolean z11 = false;
        this.f40134g1 = 0;
        this.f40136h1 = -1;
        final zt0 zt0Var = (zt0) this;
        this.f40145m1 = new g3(zt0Var, 13);
        byte b10 = 1;
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.H1 = new Paint(1);
        this.I1 = new Paint(1);
        this.J1 = new Paint(1);
        og.v1 v1Var = new og.v1(1.0f, 0.016773745f, -1);
        this.K1 = v1Var;
        this.O1 = new Paint(1);
        this.Y1 = false;
        this.Z1 = new d6((View) this, 350L, wr.h);
        this.a2 = new Paint(1);
        Paint paint = new Paint(1);
        this.f40125b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        byte b11 = 2;
        this.f40129d2 = new float[2];
        this.f40131e2 = new int[2];
        new l9(zt0Var, 27);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new dh.b(3, f6Var);
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        og.x0 e = og.x0.e(i10);
        this.V1 = e;
        e.i(0, true);
        v1Var.f14534a = e.c();
        v1Var.f14536c = e.f14557i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.f40149o1 = i11;
        og.y1 y1Var = new og.y1();
        this.F0 = y1Var;
        y1Var.f14570a = new org.telegram.tgnet.j(zt0Var, 8);
        c0 c0Var = new c0(zt0Var, context, new og.v0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = c0Var;
        c0Var.setDelegate(new d0(zt0Var, ir0Var));
        c0Var.setUndoStore(y1Var);
        c0Var.setQueue(dispatchQueue);
        c0Var.setVisibility(4);
        addView(c0Var, a6.e(-1, -1, 51));
        e0 e0Var = new e0(zt0Var, context);
        this.X0 = e0Var;
        e0Var.setVisibility(4);
        addView(e0Var, a6.e(-1, -1, 51));
        g0 g0Var = new g0(zt0Var, context, new f0(zt0Var));
        this.Z0 = g0Var;
        addView(g0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i13);
                byte b12 = mediaEntity.type;
                if (b12 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & b11) != 0) {
                        i02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    x1Var = i02;
                } else if (b12 == b10) {
                    ?? j02 = j0(z11);
                    j02.setType(mediaEntity.subType);
                    j02.setTypeface(mediaEntity.textTypeface);
                    j02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i14);
                        int i15 = i14 + 1;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        y5 y5Var = new y5(emojiEntity2.document_id, j02.getFontMetricsInt());
                        int i16 = emojiEntity2.offset;
                        spannableString.setSpan(y5Var, i16, emojiEntity2.length + i16, 33);
                        size = size;
                        size2 = size2;
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
                    u0(j02, mediaEntity.textAlign);
                    og.v1 swatch = j02.getSwatch();
                    swatch.f14534a = mediaEntity.color;
                    j02.setSwatch(swatch);
                    x1Var = j02;
                } else {
                    i12 = size;
                    if (b12 == 2) {
                        x1 h02 = h0(mediaEntity.text, false);
                        h02.B0 = false;
                        if ((mediaEntity.subType & 2) != 0) {
                            h02.r(false);
                        }
                        if ((mediaEntity.subType & 16) != 0) {
                            h02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                        layoutParams2.width = mediaEntity.viewWidth;
                        layoutParams2.height = mediaEntity.viewHeight;
                        x1Var = h02;
                    } else {
                        i13++;
                        size = i12;
                        z11 = false;
                        b11 = 2;
                        b10 = 1;
                    }
                }
                x1Var.setX((mediaEntity.f14669x * this.R0.f27499a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                x1Var.setY((mediaEntity.f14670y * this.R0.f27500b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                x1Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + x1Var.getX(), (mediaEntity.viewHeight / 2.0f) + x1Var.getY()));
                x1Var.setScale(mediaEntity.scale);
                x1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i13++;
                size = i12;
                z11 = false;
                b11 = 2;
                b10 = 1;
            }
        }
        this.Z0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.Y0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.f40124b1 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, a6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f40157w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zt0 zt0Var2 = zt0Var;
                        c0 c0Var2 = zt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof og.l)) {
                            c0Var2.b();
                            zt0Var2.f40154t1.setSelectedIndex(1);
                            zt0Var2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        zt0Var2.F0.c();
                        return;
                    case 1:
                        zt0 zt0Var3 = zt0Var;
                        c0 c0Var3 = zt0Var3.W0;
                        og.y1 y1Var2 = zt0Var3.F0;
                        if (y1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof og.l)) {
                                c0Var3.b();
                                zt0Var3.f40154t1.setSelectedIndex(1);
                                zt0Var3.B((og.m) og.m.f14420a.get(0));
                            }
                            c0Var3.a();
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            zt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        zt0 zt0Var4 = zt0Var;
                        j jVar = zt0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (zt0Var4.f40135g2) {
                            zt0Var4.l0(false);
                        }
                        zt0Var4.q0(zt0Var4.S0);
                        zt0Var4.r0(null, true);
                        return;
                    default:
                        zt0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, a6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f40158x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        em.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, a6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, a6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new d5(21));
        frameLayout2.addView(linearLayout, a6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f40159y1 = textView2;
        textView2.setBackground(j6.f0(822083583, 7, -1));
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
                        zt0 zt0Var2 = zt0Var;
                        c0 c0Var2 = zt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof og.l)) {
                            c0Var2.b();
                            zt0Var2.f40154t1.setSelectedIndex(1);
                            zt0Var2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        zt0Var2.F0.c();
                        return;
                    case 1:
                        zt0 zt0Var3 = zt0Var;
                        c0 c0Var3 = zt0Var3.W0;
                        og.y1 y1Var2 = zt0Var3.F0;
                        if (y1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof og.l)) {
                                c0Var3.b();
                                zt0Var3.f40154t1.setSelectedIndex(1);
                                zt0Var3.B((og.m) og.m.f14420a.get(0));
                            }
                            c0Var3.a();
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            zt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        zt0 zt0Var4 = zt0Var;
                        j jVar = zt0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (zt0Var4.f40135g2) {
                            zt0Var4.l0(false);
                        }
                        zt0Var4.q0(zt0Var4.S0);
                        zt0Var4.r0(null, true);
                        return;
                    default:
                        zt0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView f7 = r6.f(frameLayout2, textView2, a6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f40160z1 = f7;
        f7.setBackground(j6.f0(822083583, 7, -1));
        f7.setPadding(r6.b(8.0f, R.string.Clear, f7), 0, AndroidUtilities.dp(8.0f), 0);
        f7.setGravity(16);
        f7.setTextColor(-1);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextSize(1, 16.0f);
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zt0 zt0Var2 = zt0Var;
                        c0 c0Var2 = zt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof og.l)) {
                            c0Var2.b();
                            zt0Var2.f40154t1.setSelectedIndex(1);
                            zt0Var2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        zt0Var2.F0.c();
                        return;
                    case 1:
                        zt0 zt0Var3 = zt0Var;
                        c0 c0Var3 = zt0Var3.W0;
                        og.y1 y1Var2 = zt0Var3.F0;
                        if (y1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof og.l)) {
                                c0Var3.b();
                                zt0Var3.f40154t1.setSelectedIndex(1);
                                zt0Var3.B((og.m) og.m.f14420a.get(0));
                            }
                            c0Var3.a();
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            zt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        zt0 zt0Var4 = zt0Var;
                        j jVar = zt0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (zt0Var4.f40135g2) {
                            zt0Var4.l0(false);
                        }
                        zt0Var4.q0(zt0Var4.S0);
                        zt0Var4.r0(null, true);
                        return;
                    default:
                        zt0Var.r0(null, true);
                        return;
                }
            }
        });
        f7.setAlpha(0.0f);
        f7.setVisibility(8);
        TextView f10 = r6.f(frameLayout2, f7, a6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.A1 = f10;
        f10.setBackground(j6.f0(822083583, 7, -1));
        f10.setPadding(r6.b(8.0f, R.string.Done, f10), 0, AndroidUtilities.dp(8.0f), 0);
        f10.setGravity(16);
        f10.setTextColor(-1);
        f10.setTypeface(AndroidUtilities.bold());
        f10.setTextSize(1, 16.0f);
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zt0 zt0Var2 = zt0Var;
                        c0 c0Var2 = zt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof og.l)) {
                            c0Var2.b();
                            zt0Var2.f40154t1.setSelectedIndex(1);
                            zt0Var2.B((og.m) og.m.f14420a.get(0));
                            return;
                        }
                        zt0Var2.F0.c();
                        return;
                    case 1:
                        zt0 zt0Var3 = zt0Var;
                        c0 c0Var3 = zt0Var3.W0;
                        og.y1 y1Var2 = zt0Var3.F0;
                        if (y1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof og.l)) {
                                c0Var3.b();
                                zt0Var3.f40154t1.setSelectedIndex(1);
                                zt0Var3.B((og.m) og.m.f14420a.get(0));
                            }
                            c0Var3.a();
                            y1Var2.f14572c.clear();
                            y1Var2.f14571b.clear();
                            AndroidUtilities.runOnUIThread(new gg.v1(y1Var2, 27));
                            zt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        zt0 zt0Var4 = zt0Var;
                        j jVar = zt0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (zt0Var4.f40135g2) {
                            zt0Var4.l0(false);
                        }
                        zt0Var4.q0(zt0Var4.S0);
                        zt0Var4.r0(null, true);
                        return;
                    default:
                        zt0Var.r0(null, true);
                        return;
                }
            }
        });
        f10.setAlpha(0.0f);
        f10.setVisibility(8);
        frameLayout2.addView(f10, a6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        k0 k0Var = new k0(zt0Var, context);
        this.f40126c1 = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        k0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(k0Var, a6.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1 r1Var = new r1(context, z10);
        this.f40154t1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        k0Var.addView(r1Var, a6.c(48.0f, -1));
        o1 o1Var = new o1(context);
        this.f40155u1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        o1Var.setAlignment(og.x0.e(i10).f14556g);
        k0Var.addView(o1Var, a6.c(48.0f, -1));
        i0 i0Var = new i0(zt0Var, context);
        this.f40128d1 = i0Var;
        addView(i0Var, a6.c(-1.0f, -1));
        t1 t1Var = new t1(context);
        this.f40156v1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new ai.g(zt0Var, 13));
        o1Var.setTypefaceListView(t1Var);
        i0Var.addView(t1Var, a6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(j6.v0(j6.G8, this.Q1));
        j0 j0Var = new j0(zt0Var, context);
        this.G1 = j0Var;
        j0Var.setVisibility(8);
        j0Var.setColorPalette(og.x0.e(i10));
        j0Var.setColorListener(new m(zt0Var, 0));
        k0Var.addView(j0Var, a6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        f1 f1Var = new f1(context);
        this.A0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(j6.f0(1090519039, 1, -1));
        k0Var.addView(f1Var, a6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        j1 j1Var = new j1(context);
        this.B0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(j6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new bi.q(zt0Var, context, bitmap2, 25));
        k0Var.addView(j1Var, a6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w1 w1Var = new w1(context);
        this.l1 = w1Var;
        w1Var.setColorSwatch(this.K1);
        w1Var.setRenderView(this.W0);
        w1Var.setValueOverride(this.f40145m1);
        this.K1.f14536c = this.f40145m1.get();
        w1Var.setOnUpdate(new zd(zt0Var, i10, 29));
        addView(w1Var, a6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f40130e1 = frameLayout3;
        addView(frameLayout3, a6.c(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.K1, null);
        B((og.m) og.m.f14420a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(zt0 zt0Var, Integer num) {
        zt0Var.setNewColor(num.intValue());
        zt0Var.w0(false);
    }

    public static void a0(pg.m0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: pg.m0.a0(pg.m0):void");
    }

    public static void b0(m0 m0Var) {
        o2 o2Var;
        g0 g0Var = m0Var.Z0;
        j jVar = m0Var.S0;
        if (jVar != null) {
            PointF A0 = m0Var.A0(jVar);
            j jVar2 = m0Var.S0;
            if (jVar2 instanceof o2) {
                o2 o2Var2 = new o2(m0Var.getContext(), (o2) m0Var.S0, A0);
                o2Var2.setDelegate(m0Var);
                g0Var.addView(o2Var2);
                o2Var = o2Var2;
            } else if (jVar2 instanceof v2) {
                v2 v2Var = new v2(m0Var.getContext(), (v2) m0Var.S0, A0);
                v2Var.setDelegate(m0Var);
                v2Var.setMaxWidth((int) (m0Var.getPaintingSize().f27499a - 20.0f));
                g0Var.addView(v2Var, a6.c(-2.0f, -2));
                o2Var = v2Var;
            } else {
                o2Var = null;
            }
            m0Var.p0(o2Var);
            m0Var.r0(o2Var, true);
        }
        org.telegram.ui.ActionBar.p1 p1Var = m0Var.R1;
        if (p1Var != null && p1Var.isShowing()) {
            m0Var.R1.d(true);
        }
    }

    public static void c0(zt0 zt0Var, Integer num) {
        og.x0 x0Var = zt0Var.V1;
        x0Var.h(num.intValue(), true);
        x0Var.g();
        zt0Var.setNewColor(num.intValue());
        j0 j0Var = zt0Var.G1;
        j0Var.setSelectedColorIndex(x0Var.d());
        j0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f40134g1 == 2) {
            return this.f40155u1;
        }
        return this.f40154t1;
    }

    private int getFrameRotation() {
        int i10 = this.f40149o1;
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

    private tv0 getPaintingSize() {
        int i10;
        tv0 tv0Var = this.R0;
        if (tv0Var != null) {
            return tv0Var;
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
        tv0 tv0Var2 = new tv0(width, height);
        float f7 = i10;
        tv0Var2.f27499a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        tv0Var2.f27500b = floor;
        if (floor > f7) {
            tv0Var2.f27500b = f7;
            tv0Var2.f27499a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = tv0Var2;
        return tv0Var2;
    }

    public void setNewColor(int i10) {
        og.v1 v1Var = this.K1;
        int i11 = v1Var.f14534a;
        v1Var.f14534a = i10;
        s0(v1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new z5(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.U0 = i10;
        j jVar = this.S0;
        if (jVar instanceof v2) {
            ((v2) jVar).setType(i10);
        }
        og.x0 e = og.x0.e(this.P1);
        e.h = i10;
        e.f14552a.edit().putInt("text_type", i10).apply();
        this.f40155u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        w6 w6Var = new w6(this, context);
        this.f40132f1 = w6Var;
        w6Var.setClipToPadding(false);
        this.f40132f1.setOrientation(0);
        this.f40126c1.addView(this.f40132f1, a6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f40151q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f40151q1;
        int i10 = j6.f18017i6;
        dh.b bVar = this.Q1;
        textView2.setBackground(j6.f0(j6.v0(i10, bVar), 7, -1));
        this.f40151q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f40151q1.setTextColor(-1);
        this.f40151q1.setTextSize(1, 14.0f);
        this.f40151q1.setGravity(1);
        this.f40151q1.setTypeface(AndroidUtilities.bold());
        this.f40151q1.setSingleLine();
        this.f40151q1.setOnClickListener(new k(this, 0));
        this.f40132f1.addView(this.f40151q1, a6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f40152r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f40152r1.setBackground(j6.f0(j6.v0(i10, bVar), 7, -1));
        this.f40152r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f40152r1.setOnClickListener(new k(this, 1));
        this.f40152r1.setTextColor(-1);
        this.f40152r1.setTextSize(1, 14.0f);
        this.f40152r1.setGravity(1);
        this.f40152r1.setTypeface(AndroidUtilities.bold());
        this.f40152r1.setAlpha(0.6f);
        this.f40152r1.setSingleLine();
        this.f40132f1.addView(this.f40152r1, a6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f40153s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f40153s1.setBackground(j6.f0(j6.v0(i10, bVar), 7, -1));
        this.f40153s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f40153s1.setTextColor(-1);
        this.f40153s1.setTextSize(1, 14.0f);
        this.f40153s1.setGravity(1);
        this.f40153s1.setTypeface(AndroidUtilities.bold());
        this.f40153s1.setAlpha(0.6f);
        this.f40153s1.setSingleLine();
        this.f40153s1.setOnClickListener(new k(this, 4));
        this.f40132f1.addView(this.f40153s1, a6.l(1.0f, 0, -2));
    }

    public static void u0(v2 v2Var, int i10) {
        int i11;
        v2Var.setAlign(i10);
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
        v2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        v2Var.getEditText().setTextAlignment(i12);
    }

    public final PointF A0(j jVar) {
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
                g0 g0Var = this.Z0;
                if (i10 >= g0Var.getChildCount()) {
                    break;
                }
                View childAt = g0Var.getChildAt(i10);
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

    @Override
    public final void B(og.m mVar) {
        boolean z10 = mVar instanceof og.b;
        w1 w1Var = this.l1;
        if (!z10 && !(mVar instanceof og.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof og.l));
        c0 c0Var = this.W0;
        if (c0Var.getCurrentBrush() instanceof og.l) {
            this.f40142k1 = true;
        }
        c0Var.setBrush(mVar);
        og.v1 v1Var = this.K1;
        int i10 = v1Var.f14534a;
        v1Var.f14534a = og.x0.e(this.P1).c();
        v1Var.f14536c = this.f40145m1.get();
        s0(v1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    public final void B0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.f40134g1 != i10 && this.f40136h1 != i10) {
            ValueAnimator valueAnimator = this.f40140j1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f40134g1;
            ViewGroup viewGroup3 = this.f40155u1;
            ViewGroup viewGroup4 = this.f40154t1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f40136h1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.P1;
            og.x0 e = og.x0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f14560l != z10) {
                e.f14560l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f14552a.getInt("brush", 0), false);
                }
            }
            int c10 = og.x0.e(i12).c();
            og.v1 v1Var = this.K1;
            v1Var.f14534a = c10;
            s0(v1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f40140j1 = duration;
            duration.setInterpolator(wr.f28819f);
            this.f40140j1.addUpdateListener(new v5(this, viewGroup, viewGroup2, 3));
            this.f40140j1.addListener(new x6(this, viewGroup, viewGroup2, i10, 2));
            this.f40140j1.start();
        }
    }

    @Override
    public final void C() {
        z0(true);
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            g0 g0Var = this.Z0;
            if (i10 < g0Var.getChildCount()) {
                View childAt = g0Var.getChildAt(i10);
                if (childAt != this.S0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f40055l0 && jVar.f40053j0 <= 0.0f) {
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
    public final void D(j jVar) {
        int[] k02 = k0(jVar);
        y0(new t(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f40137h2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f40144l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f40144l2).commit();
            } else {
                this.f40143k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f40143k2).commit();
            }
        }
        if (this.f40135g2) {
            if (z10) {
                i11 = this.f40144l2;
            } else {
                i11 = this.f40143k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40133f2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f40133f2.setLayoutParams(layoutParams);
                this.f40141j2 = layoutParams.height;
                requestLayout();
                b5 b5Var = ((zt0) this).f39441o2.K1;
                if (b5Var != null) {
                    b5Var.a();
                }
                getHeight();
            }
        }
        if (this.f40146m2 == i10 && this.f40148n2 == z10) {
            getHeight();
            return;
        }
        this.f40146m2 = i10;
        this.f40148n2 = z10;
        boolean z13 = this.f40137h2;
        j jVar = this.S0;
        if (jVar instanceof v2) {
            if (((v2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f40137h2 = z12;
        } else {
            this.f40137h2 = false;
        }
        if (this.f40137h2 && this.f40135g2) {
            x0(0);
        }
        if (this.f40141j2 != 0 && !(z11 = this.f40137h2) && z11 != z13 && !this.f40135g2) {
            this.f40141j2 = 0;
            requestLayout();
            b5 b5Var2 = ((zt0) this).f39441o2.K1;
            if (b5Var2 != null) {
                b5Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        w0(true);
    }

    @Override
    public final void c() {
        setTextType((this.U0 + 1) % 4);
    }

    @Override
    public final void d(int i10) {
        j jVar = this.S0;
        if (jVar instanceof v2) {
            u0((v2) jVar, i10);
            og.x0 e = og.x0.e(this.P1);
            e.f14556g = i10;
            e.f14552a.edit().putInt("text_alignment", i10).apply();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g0 g0Var;
        v2 v2Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (g0Var = this.Z0) != null) {
            for (int i12 = 0; i12 < g0Var.getChildCount(); i12++) {
                View childAt = g0Var.getChildAt(i12);
                if ((childAt instanceof v2) && (str = (v2Var = (v2) childAt).A0) != null) {
                    v2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: pg.m0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        this.O1.setColor(-15132391);
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.x1(4, this, (x1) view)).start();
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        tv0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f27499a / 2.0f;
        float f10 = paintingSize.f27500b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float f11 = (float) hc.b.f(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f27499a;
            f10 -= f11 * paintingSize.f27500b;
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
        return this.f40150p1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        y5[] y5VarArr;
        g0 g0Var = this.Z0;
        int childCount = g0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = g0Var.getChildAt(i10);
            if (childAt instanceof o2) {
                TLRPC.Document sticker = ((o2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f17207id = sticker.f17201id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof v2) {
                CharSequence text = ((v2) childAt).getText();
                if ((text instanceof Spanned) && (y5VarArr = (y5[]) ((Spanned) text).getSpans(0, text.length(), y5.class)) != null) {
                    for (y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = p5.f(this.P1, y5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f17207id = document.f17201id;
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

    public og.h1 getRenderView() {
        return this.W0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.S0;
        g0 g0Var = this.Z0;
        if (jVar == null) {
            return getY() + g0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (g0Var.getScaleY() * this.S0.getHeight()) + iArr[1];
    }

    public k11 getThanosEffect() {
        if (!k11.c()) {
            return null;
        }
        if (this.f40123a1 == null) {
            k11 k11Var = new k11(getContext(), new n(this, 0));
            this.f40123a1 = k11Var;
            addView(k11Var);
        }
        return this.f40123a1;
    }

    public final x1 h0(String str, boolean z10) {
        float f7;
        tv0 tv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        g0 g0Var = this.Z0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(g0Var.getMeasuredWidth() * 0.5d);
            tv0Var = new tv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(g0Var.getMeasuredHeight() * 0.5d);
            tv0Var = new tv0(f7 * floor2, floor2);
        }
        tv0 tv0Var2 = tv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = tv0Var2.f27499a;
            tv0Var2.f27499a = tv0Var2.f27500b;
            tv0Var2.f27500b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        x1 x1Var = new x1(context, g02, tv0Var2, str, intValue);
        x1Var.setDelegate(this);
        g0Var.addView(x1Var);
        if (z10) {
            p0(x1Var);
            r0(x1Var, true);
        }
        return x1Var;
    }

    public final pg.z i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: pg.m0.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):pg.z");
    }

    public final v2 j0(boolean z10) {
        ((zt0) this).f39441o2.f30066g0.isFocusable();
        tv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        v2 v2Var = new v2(getContext(), A0, (int) (paintingSize.f27499a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.f27499a / 9.0f;
        n nVar = new n(this, 2);
        v2Var.f40328w0 = (int) (0.5f * f7);
        v2Var.f40329x0 = (int) (f7 * 2.0f);
        v2Var.f40330y0 = nVar;
        float f10 = A0.x;
        g0 g0Var = this.Z0;
        if (f10 == g0Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (A0.y == g0Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth((int) (paintingSize.f27499a - 20.0f));
        int i10 = this.P1;
        v2Var.setTypeface(og.x0.e(i10).f14558j);
        v2Var.setType(og.x0.e(i10).h);
        g0Var.addView(v2Var, a6.c(-2.0f, -2));
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(v2Var);
            v2Var.q();
            r0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.T0 = true;
            int i11 = og.x0.e(i10).f14556g;
            o1 o1Var = this.f40155u1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(og.x0.e(i10).h);
        }
        return v2Var;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (this.S0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        c0 c0Var = this.W0;
        float translationX = ((x10 - c0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - c0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / c0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (c0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (c0Var.getMeasuredHeight() / 2.0f) + ((float) hc.b.f(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.f40129d2;
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
        int[] iArr = this.f40131e2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f7 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f7;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) hc.b.f(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    @Override
    public final boolean l(j jVar) {
        return r0(jVar, true);
    }

    public final void l0(boolean z10) {
        if (this.f40135g2) {
            x0(0);
        }
        if (z10) {
            rz rzVar = this.f40133f2;
            if (rzVar != null && rzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f40133f2.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.f40139i2 = true;
                ofFloat.addListener(new a0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                ofFloat.start();
                return;
            }
            m0();
        }
    }

    public final void m0() {
        rz rzVar;
        b5 b5Var;
        if (this.f40141j2 > 0 && (b5Var = ((zt0) this).f39441o2.K1) != null) {
            b5Var.a();
        }
        if (!this.f40135g2 && (rzVar = this.f40133f2) != null && rzVar.getVisibility() != 8) {
            this.f40133f2.setVisibility(8);
        }
        this.f40141j2 = 0;
    }

    public final void n0(boolean z10) {
        int i10;
        int i11;
        if (this.f40134g1 == 0) {
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
            this.f40126c1.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.f40124b1.setLayerType(i12, null);
        }
    }

    public final boolean o0() {
        if (this.L1) {
            w0(false);
            return true;
        } else if (this.f40135g2) {
            l0(true);
            return true;
        } else if (!this.T0) {
            return false;
        } else {
            r0(null, true);
            return true;
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
        if (this.f40133f2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f40133f2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f40133f2.getMeasuredHeight();
            }
            rz rzVar = this.f40133f2;
            rzVar.layout(0, R, rzVar.getMeasuredWidth(), this.f40133f2.getMeasuredHeight() + R);
        }
        if (!this.V0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        c0 c0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - c0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.a2.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - c0Var.getMeasuredHeight()) / 2, i16);
        c0Var.layout(ceil, additionalTop, c0Var.getMeasuredWidth() + ceil, c0Var.getMeasuredHeight() + additionalTop);
        e0 e0Var = this.X0;
        e0Var.layout(ceil, additionalTop, e0Var.getMeasuredWidth() + ceil, e0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = c0Var.getMeasuredWidth();
        g0 g0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - g0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((c0Var.getMeasuredHeight() - g0Var.getMeasuredHeight()) / 2) + additionalTop;
        g0Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
        k11 k11Var = this.f40123a1;
        if (k11Var != null) {
            k11Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
        }
        h0 h0Var = this.Y0;
        h0Var.layout(ceil, additionalTop, h0Var.getMeasuredWidth() + ceil, h0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.P0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.D0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
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
        float f12 = f10 / this.R0.f27499a;
        this.Q0 = f12;
        g0 g0Var = this.Z0;
        g0Var.setScaleX(f12);
        g0Var.setScaleY(this.Q0);
        g0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f27499a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f27500b, 1073741824));
        k11 k11Var = this.f40123a1;
        if (k11Var != null) {
            k11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f27499a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f27500b, 1073741824));
            this.f40123a1.setScaleX(this.Q0);
            this.f40123a1.setScaleY(this.Q0);
        }
        C0();
        this.Y0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.f40126c1, i10, i11);
        measureChild(this.l1, i10, i11);
        measureChild(this.f40130e1, i10, i11);
        measureChild(this.f40128d1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f40141j2), 1073741824));
        FrameLayout frameLayout = this.f40124b1;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.P0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f40135g2 && !this.f40139i2) {
            this.P0 = true;
            m0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        rz rzVar = this.f40133f2;
        if (rzVar != null) {
            measureChild(rzVar, i10, i11);
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.F0.b(jVar.getUUID(), new t(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return !this.T0;
    }

    public final void q0(j jVar) {
        j jVar2 = this.S0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.S0 = null;
            if (jVar instanceof v2) {
                ValueAnimator valueAnimator = this.f40140j1;
                if (valueAnimator != null && this.f40136h1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            og.y1 y1Var = this.F0;
            y1Var.f14571b.remove(uuid);
            y1Var.f14572c.remove(uuid);
            AndroidUtilities.runOnUIThread(new gg.v1(y1Var, 27));
        }
        w1 w1Var = this.l1;
        g3 g3Var = this.f40145m1;
        w1Var.setValueOverride(g3Var);
        w1Var.setShowPreview(true);
        float f7 = g3Var.get();
        og.v1 v1Var = this.K1;
        v1Var.f14536c = f7;
        s0(v1Var, null);
    }

    public final boolean r0(j jVar, boolean z10) {
        m0 m0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof v2;
        int i11 = 2;
        if (z12 && (((i10 = this.f40136h1) == -1 && this.f40134g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f40140j1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.L1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            v2 v2Var = (v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            o1 o1Var = this.f40155u1;
            o1Var.setAlignment(i11);
            o1Var.setTypeface(v2Var.getTypeface().f14424a);
            o1Var.e(v2Var.getType(), true);
            this.f40128d1.invalidate();
        }
        j jVar2 = this.S0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.T0) {
                    int[] k02 = k0(jVar2);
                    y0(new t(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof v2) {
                    AndroidUtilities.showKeyboard(((v2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            m0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = m0Var.S0;
            if (jVar3 instanceof v2) {
                v2 v2Var2 = (v2) jVar3;
                u2 u2Var = v2Var2.f40322q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    m0Var.T0 = false;
                    AndroidUtilities.hideKeyboard(((v2) m0Var.S0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        } else {
            m0Var = this;
            z11 = false;
        }
        j jVar4 = m0Var.S0;
        m0Var.S0 = jVar;
        if ((jVar4 instanceof v2) && TextUtils.isEmpty(((v2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = m0Var.S0;
        g3 g3Var = m0Var.f40145m1;
        og.v1 v1Var = m0Var.K1;
        w1 w1Var = m0Var.l1;
        if (jVar5 != null) {
            h0 h0Var = m0Var.Y0;
            jVar5.m0 = h0Var;
            jVar5.l(h0Var, true);
            m0Var.Z0.bringChildToFront(m0Var.S0);
            j jVar6 = m0Var.S0;
            if (jVar6 instanceof v2) {
                v2 v2Var3 = (v2) jVar6;
                v2Var3.f40331z0 = false;
                v2Var3.getSwatch().f14536c = v1Var.f14536c;
                s0(v2Var3.getSwatch(), null);
                w1Var.setValueOverride(new s6(v2Var3, (int) (m0Var.R0.f27499a / 9.0f), 1));
                w1Var.setShowPreview(false);
                return true;
            }
            w1Var.setValueOverride(g3Var);
            w1Var.setShowPreview(true);
            v1Var.f14536c = g3Var.get();
            s0(v1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = m0Var.f40140j1;
        if (valueAnimator2 != null && m0Var.f40136h1 != 0) {
            valueAnimator2.cancel();
        }
        if (m0Var.L1) {
            w0(false);
        }
        B0(0);
        w1Var.setValueOverride(g3Var);
        w1Var.setShowPreview(true);
        v1Var.f14536c = g3Var.get();
        s0(v1Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.P0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        b5 b5Var;
        if (!this.f40137h2 && !this.f40135g2) {
            j0(true);
            return;
        }
        boolean z10 = this.f40135g2;
        if (z10 && (b5Var = ((zt0) this).f39441o2.K1) != null) {
            b5Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.S0;
            if (jVar instanceof v2) {
                AndroidUtilities.showKeyboard(((v2) jVar).getEditText());
            }
        }
    }

    public final void s0(og.v1 v1Var, Integer num) {
        og.v1 v1Var2 = this.K1;
        if (v1Var2 != v1Var) {
            v1Var2.f14534a = v1Var.f14534a;
            v1Var2.f14535b = v1Var.f14535b;
            v1Var2.f14536c = v1Var.f14536c;
            int i10 = this.P1;
            og.x0.e(i10).h(v1Var.f14534a, true);
            og.x0.e(i10).j(v1Var.f14536c);
        }
        int i11 = v1Var.f14534a;
        c0 c0Var = this.W0;
        c0Var.setColor(i11);
        c0Var.setBrushSize(v1Var.f14536c);
        int i12 = v1Var2.f14534a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new s5(this, num, i12, 2));
            duration.start();
        } else {
            k0 k0Var = this.f40126c1;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        }
        j jVar = this.S0;
        if (jVar instanceof v2) {
            ((v2) jVar).setSwatch(new og.v1(v1Var.f14535b, v1Var.f14536c, v1Var.f14534a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(bh.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        this.f40127c2 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.W1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.f40134g1 == 0) {
            this.l1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.U1 = runnable;
    }

    @Override
    public final void t(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) hc.b.f(radians, d10, Math.sin(radians) * d));
    }

    public final void t0(float f7) {
        this.C0 = f7;
        this.f40124b1.setTranslationY(-f7);
        this.f40126c1.setTranslationY(f7);
    }

    @Override
    public final og.x0 u() {
        return og.x0.e(this.P1);
    }

    public final void v0(float f7, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        this.I0 = f7;
        this.N0 = f12;
        this.O0 = f13;
        this.J0 = f10;
        this.K0 = f11;
        this.L0 = f10;
        float f20 = f11 + 0.0f;
        this.M0 = f20;
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
                float f21 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i11 = cropState.transformRotation;
                    if (i11 == 90 || i11 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f12 / ((int) (cropState.cropPw * f18)), f13 / ((int) (cropState.cropPh * f19)));
                    f14 = f21 * max;
                    float C = com.google.android.gms.internal.vision.e2.C(cropState.cropPx, measuredWidth, f7, max);
                    float f22 = cropState.cropScale;
                    f15 = (C * f22) + f10;
                    f16 = (cropState.cropPy * measuredHeight * f7 * max * f22) + f20;
                    f17 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                if (i10 == 0) {
                    f14 = this.Q0 * 1.0f;
                } else {
                    f14 = 1.0f;
                }
                f15 = f10;
                f16 = f20;
                f17 = 0.0f;
            }
            float f23 = ((-this.f40141j2) / 2.0f) + f16;
            float f24 = f7 * f14;
            if (Float.isNaN(f24)) {
                f24 = 1.0f;
            }
            view.setScaleX(f24);
            view.setScaleY(f24);
            view.setTranslationX(f15);
            view.setTranslationY(f23);
            view.setRotation(f17);
            view.invalidate();
        }
        C0();
        invalidate();
    }

    public final void w0(final boolean z10) {
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
            lVar.f14140i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f14134u = lVar;
            if (!this.f40137h2 && !this.f40135g2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.f40126c1.getTranslationY();
            final ViewGroup barView = getBarView();
            this.M1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    m0 m0Var = m0.this;
                    k0 k0Var = m0Var.f40126c1;
                    float f13 = f11 / 1000.0f;
                    m0Var.N1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(m0Var.N1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(m0Var.N1, 0.25f) / 0.25f));
                    j0 j0Var = m0Var.G1;
                    float f15 = m0Var.N1;
                    boolean z12 = z10;
                    j0Var.x1(f15, z12);
                    m0Var.B0.setProgress(m0Var.N1);
                    m0Var.A0.setProgress(m0Var.N1);
                    m0Var.f40132f1.setTranslationY(AndroidUtilities.dp(32.0f) * m0Var.N1);
                    if (zArr[0]) {
                        float f16 = m0Var.N1;
                        if (!z12) {
                            f16 = 1.0f - f16;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f16;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        k0Var.setTranslationY(translationY - (dp * i10));
                    }
                    k0Var.invalidate();
                    if (view == m0Var.f40155u1) {
                        m0Var.f40128d1.invalidate();
                    }
                }
            });
            this.M1.a(new r(this, z10, 1));
            this.M1.f();
            if (z10) {
                j0 j0Var = this.G1;
                j0Var.setVisibility(0);
                j0Var.setSelectedColorIndex(og.x0.e(this.P1).d());
            }
        }
    }

    @Override
    public final void x() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void x0(int i10) {
        boolean z10;
        int i11;
        o1 o1Var = this.f40155u1;
        if (i10 == 1) {
            rz rzVar = this.f40133f2;
            if (rzVar != null && rzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rz rzVar2 = this.f40133f2;
            if (rzVar2 != null && rzVar2.f26805c1 != UserConfig.selectedAccount) {
                removeView(rzVar2);
                this.f40133f2 = null;
            }
            if (this.f40133f2 == null) {
                rz rzVar3 = new rz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
                this.f40133f2 = rzVar3;
                rzVar3.U0 = true;
                rzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f40133f2.setForseMultiwindowLayout(true);
                }
                this.f40133f2.setDelegate(new b0(this));
                addView(this.f40133f2);
            }
            this.f40133f2.setVisibility(0);
            this.f40135g2 = true;
            rz rzVar4 = this.f40133f2;
            if (this.f40143k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f40143k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f40143k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f40144l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f40144l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f40144l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f40144l2;
            } else {
                i11 = this.f40143k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rzVar4.getLayoutParams();
            layoutParams.height = i11;
            rzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.S0;
                if (jVar instanceof v2) {
                    AndroidUtilities.hideKeyboard(((v2) jVar).getEditText());
                }
            }
            this.f40141j2 = i11;
            requestLayout();
            b5 b5Var = ((zt0) this).f39441o2.K1;
            if (b5Var != null) {
                b5Var.a();
            }
            dh emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(bh.d, true);
            }
            getHeight();
            if (!z10 && !this.f40137h2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40141j2, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new a0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        dh emojiButton2 = o1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(bh.e, true);
        }
        rz rzVar5 = this.f40133f2;
        if (rzVar5 != null) {
            this.f40135g2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                rzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f40141j2 = 0;
        }
        b5 b5Var2 = ((zt0) this).f39441o2.K1;
        if (b5Var2 != null) {
            b5Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, m0 m0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.p1 p1Var = this.R1;
        if (p1Var != null && p1Var.isShowing()) {
            this.R1.d(true);
            return;
        }
        if (this.S1 == null) {
            this.T1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.Q1);
            this.S1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.S1.setBackgroundColor(-14145495);
            this.S1.setOnTouchListener(new bi.d6(this, 1));
            this.S1.setDispatchKeyEventListener(new q(this));
            this.S1.setShownFromBottom(true);
        }
        this.S1.d();
        runnable.run();
        if (this.R1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.S1, -2, -2);
            this.R1 = p1Var2;
            p1Var2.f18534b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.R1.setOutsideTouchable(true);
            this.R1.setClippingEnabled(true);
            this.R1.setInputMethodMode(2);
            this.R1.setSoftInputMode(0);
            this.R1.getContentView().setFocusableInTouchMode(true);
            this.R1.setOnDismissListener(new bi.f6(this, 1));
        }
        this.S1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.R1.setFocusable(true);
        this.R1.showAtLocation(m0Var, i10, i11 - (this.S1.getMeasuredWidth() / 2), i12 - this.S1.getMeasuredHeight());
        org.telegram.ui.ActionBar.p1.i(this.S1);
    }

    @Override
    public final int[] z(j jVar) {
        return k0(jVar);
    }

    public final void z0(boolean z10) {
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
            lVar.f14140i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f14134u = lVar;
            if (z10) {
                t1 t1Var = this.f40156v1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.F1.b(new i6(2, this));
            this.F1.a(new r(this, z10, 0));
            this.F1.f();
        }
    }

    @Override
    public final void A() {
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
    public final void i() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void m(boolean z10) {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void y(boolean z10) {
    }
}
