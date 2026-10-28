package sg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import di.i8;
import di.n3;
import fi.i5;
import fi.l5;
import fi.m5;
import fi.n4;
import fi.t4;
import fi.w4;
import fi.y4;
import fi.z3;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import li.h5;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.d3;
import org.telegram.ui.pt0;
import org.telegram.ui.yg1;
import org.telegram.ui.zq0;
public abstract class m0 extends xw0 implements r1, h, n1, vw0, NotificationCenter.NotificationCenterDelegate {
    public float A0;
    public boolean A1;
    public float B0;
    public o1.j B1;
    public float C0;
    public float C1;
    public float D0;
    public final Paint D1;
    public boolean E0;
    public final int E1;
    public float F0;
    public final u F1;
    public rw0 G0;
    public org.telegram.ui.ActionBar.o1 G1;
    public j H0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout H1;
    public boolean I0;
    public Rect I1;
    public int J0;
    public Runnable J1;
    public final boolean K0;
    public final rg.s0 K1;
    public final c0 L0;
    public boolean L1;
    public final e0 M0;
    public float M1;
    public final h0 N0;
    public boolean N1;
    public final g0 O0;
    public final h6 O1;
    public h21 P0;
    public final Paint P1;
    public final FrameLayout Q0;
    public final Paint Q1;
    public final k0 R0;
    public eh.d R1;
    public final i0 S0;
    public final float[] S1;
    public final FrameLayout T0;
    public final int[] T1;
    public l5 U0;
    public sz U1;
    public int V0;
    public boolean V1;
    public int W0;
    public boolean W1;
    public float X0;
    public boolean X1;
    public ValueAnimator Y0;
    public int Y1;
    public boolean Z0;
    public int Z1;
    public final x1 f48358a1;
    public int a2;
    public final h5 f48359b1;
    public int f48360b2;
    public ArrayList f48361c1;
    public boolean f48362c2;
    public final int f48363d1;
    public BigInteger f48364e1;
    public TextView f48365f1;
    public TextView f48366g1;
    public TextView f48367h1;
    public final s1 f48368i1;
    public final p1 f48369j1;
    public final u1 f48370k1;
    public final ImageView l1;
    public final LinearLayout f48371m1;
    public final TextView f48372n1;
    public final TextView f48373o1;
    public final g1 f48374p0;
    public final TextView f48375p1;
    public final k1 f48376q0;
    public final Paint f48377q1;
    public float f48378r0;
    public final Paint f48379r1;
    public final Bitmap f48380s0;
    public float f48381s1;
    public final Bitmap f48382t0;
    public boolean f48383t1;
    public final rg.t1 f48384u0;
    public o1.j f48385u1;
    public final DispatchQueue f48386v0;
    public final j0 f48387v1;
    public final MediaController.CropState f48388w0;
    public final Paint f48389w1;
    public float f48390x0;
    public final Paint f48391x1;
    public float f48392y0;
    public final Paint f48393y1;
    public float f48394z0;
    public final rg.q1 f48395z1;

    public m0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, zq0 zq0Var, final u6 u6Var) {
        super(context, activity);
        boolean z10;
        float f7;
        int i12;
        int i13;
        Emoji.EmojiSpan[] emojiSpanArr;
        y1 y1Var;
        boolean z11 = false;
        this.V0 = 0;
        this.W0 = -1;
        final pt0 pt0Var = (pt0) this;
        this.f48359b1 = new h5(pt0Var);
        this.f48377q1 = new Paint(1);
        this.f48379r1 = new Paint(1);
        this.f48389w1 = new Paint(1);
        this.f48391x1 = new Paint(1);
        this.f48393y1 = new Paint(1);
        rg.q1 q1Var = new rg.q1(1.0f, 0.016773745f, -1);
        this.f48395z1 = q1Var;
        this.D1 = new Paint(1);
        this.N1 = false;
        this.O1 = new h6((View) this, 350L, ds.h);
        this.P1 = new Paint(1);
        Paint paint = new Paint(1);
        this.Q1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.S1 = new float[2];
        this.T1 = new int[2];
        new dy0(pt0Var, 12);
        setDelegate(this);
        this.E1 = i10;
        this.F1 = new u6() {
            @Override
            public final boolean a() {
                return y6.I.q();
            }

            @Override
            public final void b(float f10, float f11, int i14, int i15) {
                y6.q(f10, f11, i14, i15);
            }

            @Override
            public final ColorFilter c() {
                return y6.f23690v3;
            }

            @Override
            public final Paint d(String str) {
                return y6.U0(str);
            }

            @Override
            public final int e(int i14) {
                return g(i14);
            }

            @Override
            public final boolean f() {
                return false;
            }

            @Override
            public final int g(int i14) {
                if (i14 == y6.G8) {
                    return -14145495;
                }
                if (i14 != y6.E8) {
                    if (i14 == y6.f23428h5) {
                        return -14737633;
                    }
                    if (i14 == y6.f23465j5) {
                        return -592138;
                    }
                    if (i14 == y6.f23615r5) {
                        return -8553091;
                    }
                    if (i14 != y6.He) {
                        if (i14 == y6.Ke) {
                            return -1610612736;
                        }
                        if (i14 == y6.Ne || i14 == y6.Re || i14 == y6.Me) {
                            return -9539985;
                        }
                        if (i14 != y6.G6) {
                            int i15 = y6.Mh;
                            if (i14 == i15) {
                                return -11754001;
                            }
                            if (i14 == y6.f23449i6) {
                                return 536870911;
                            }
                            if (i14 != y6.Fh && i14 != y6.Eh && i14 != y6.Gh) {
                                if (i14 == y6.Hh) {
                                    return 352321535;
                                }
                                if (i14 != y6.Je && i14 != i15) {
                                    if (i14 == y6.Ie) {
                                        return 780633991;
                                    }
                                    if (i14 == y6.f23300a7) {
                                        return -15921907;
                                    }
                                    if (i14 == y6.f23522m7) {
                                        return -12500671;
                                    }
                                    if (i14 == y6.f23504l7) {
                                        return -13133079;
                                    }
                                    if (i14 == y6.f23542n7) {
                                        return -1;
                                    }
                                    if (i14 == y6.f23357d6) {
                                        return -15198183;
                                    }
                                    if (i14 == y6.f23358d7) {
                                        return -16777216;
                                    }
                                    u6 u6Var2 = u6.this;
                                    if (u6Var2 != null) {
                                        return u6Var2.g(i14);
                                    }
                                    return y6.x0(null, i14, false);
                                }
                                return -7895161;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    return -16777216;
                }
                return -1;
            }

            @Override
            public final Drawable getDrawable(String str) {
                return null;
            }

            @Override
            public final int i(int i14) {
                return g(i14);
            }

            @Override
            public final void h(int i14, int i15) {
            }
        };
        this.f48388w0 = cropState;
        this.K0 = context instanceof BubbleActivity;
        rg.s0 e = rg.s0.e(i10);
        this.K1 = e;
        e.i(0, true);
        q1Var.f47560a = e.c();
        q1Var.f47562c = e.f47583i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.f48386v0 = dispatchQueue;
        this.f48380s0 = bitmap;
        this.f48382t0 = bitmap2;
        this.f48363d1 = i11;
        rg.t1 t1Var = new rg.t1();
        this.f48384u0 = t1Var;
        t1Var.f47597a = new org.telegram.ui.Components.voip.j1(pt0Var, 11);
        byte b10 = 2;
        c0 c0Var = new c0(pt0Var, context, new rg.q0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.L0 = c0Var;
        c0Var.setDelegate(new d0(pt0Var, zq0Var));
        c0Var.setUndoStore(t1Var);
        c0Var.setQueue(dispatchQueue);
        c0Var.setVisibility(4);
        addView(c0Var, kb1.i(-1, -1, 51));
        e0 e0Var = new e0(pt0Var, context);
        this.M0 = e0Var;
        e0Var.setVisibility(4);
        addView(e0Var, kb1.i(-1, -1, 51));
        g0 g0Var = new g0(pt0Var, context, new f0(pt0Var));
        this.O0 = g0Var;
        addView(g0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    f7 = 2.0f;
                    ?? g02 = g0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & 2) != 0) {
                        g02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    i13 = i14;
                    y1Var = g02;
                } else {
                    f7 = 2.0f;
                    if (b11 == 1) {
                        ?? h02 = h0(z11);
                        h02.setType(mediaEntity.subType);
                        h02.setTypeface(mediaEntity.textTypeface);
                        h02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        for (int i15 = z11; i15 < size2; i15++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i15);
                            int i16 = size2;
                            c6 c6Var = new c6(emojiEntity.document_id, h02.getFontMetricsInt());
                            int i17 = emojiEntity.offset;
                            spannableString.setSpan(c6Var, i17, emojiEntity.length + i17, 33);
                            size = size;
                            i14 = i14;
                            size2 = i16;
                        }
                        i12 = size;
                        i13 = i14;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, h02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        h02.setText(replaceEmoji);
                        t0(h02, mediaEntity.textAlign);
                        rg.q1 swatch = h02.getSwatch();
                        swatch.f47560a = mediaEntity.color;
                        h02.setSwatch(swatch);
                        y1Var = h02;
                    } else {
                        i12 = size;
                        i13 = i14;
                        byte b12 = b10;
                        if (b11 == b12) {
                            y1 f02 = f0(mediaEntity.text, false);
                            f02.B0 = false;
                            if ((mediaEntity.subType & b12) != 0) {
                                f02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                f02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            y1Var = f02;
                        } else {
                            i14 = i13 + 1;
                            size = i12;
                            z11 = false;
                            b10 = 2;
                        }
                    }
                }
                y1Var.setX((mediaEntity.f19571x * this.G0.f32392a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f7));
                y1Var.setY((mediaEntity.f19572y * this.G0.f32393b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f7));
                y1Var.setPosition(new PointF((mediaEntity.viewWidth / f7) + y1Var.getX(), (mediaEntity.viewHeight / f7) + y1Var.getY()));
                y1Var.setScale(mediaEntity.scale);
                y1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i14 = i13 + 1;
                size = i12;
                z11 = false;
                b10 = 2;
            }
        }
        this.O0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.N0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.Q0 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, kb1.i(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.l1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(y6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pt0 pt0Var2 = pt0Var;
                        c0 c0Var2 = pt0Var2.L0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof rg.l)) {
                            c0Var2.b();
                            pt0Var2.f48368i1.setSelectedIndex(1);
                            pt0Var2.i((rg.m) rg.m.f47500a.get(0));
                            return;
                        }
                        pt0Var2.f48384u0.c();
                        return;
                    case 1:
                        pt0 pt0Var3 = pt0Var;
                        c0 c0Var3 = pt0Var3.L0;
                        rg.t1 t1Var2 = pt0Var3.f48384u0;
                        if (t1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof rg.l)) {
                                c0Var3.b();
                                pt0Var3.f48368i1.setSelectedIndex(1);
                                pt0Var3.i((rg.m) rg.m.f47500a.get(0));
                            }
                            c0Var3.a();
                            t1Var2.f47599c.clear();
                            t1Var2.f47598b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            pt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        pt0 pt0Var4 = pt0Var;
                        j jVar = pt0Var4.H0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (pt0Var4.V1) {
                            pt0Var4.k0(false);
                        }
                        pt0Var4.p0(pt0Var4.H0);
                        pt0Var4.q0(null, true);
                        return;
                    default:
                        pt0Var.q0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, kb1.h(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48371m1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(y6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        wh.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, kb1.x(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, kb1.u(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bh.f(25));
        frameLayout2.addView(linearLayout, kb1.i(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f48372n1 = textView2;
        textView2.setBackground(y6.g0(822083583, 7, -1));
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
                        pt0 pt0Var2 = pt0Var;
                        c0 c0Var2 = pt0Var2.L0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof rg.l)) {
                            c0Var2.b();
                            pt0Var2.f48368i1.setSelectedIndex(1);
                            pt0Var2.i((rg.m) rg.m.f47500a.get(0));
                            return;
                        }
                        pt0Var2.f48384u0.c();
                        return;
                    case 1:
                        pt0 pt0Var3 = pt0Var;
                        c0 c0Var3 = pt0Var3.L0;
                        rg.t1 t1Var2 = pt0Var3.f48384u0;
                        if (t1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof rg.l)) {
                                c0Var3.b();
                                pt0Var3.f48368i1.setSelectedIndex(1);
                                pt0Var3.i((rg.m) rg.m.f47500a.get(0));
                            }
                            c0Var3.a();
                            t1Var2.f47599c.clear();
                            t1Var2.f47598b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            pt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        pt0 pt0Var4 = pt0Var;
                        j jVar = pt0Var4.H0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (pt0Var4.V1) {
                            pt0Var4.k0(false);
                        }
                        pt0Var4.p0(pt0Var4.H0);
                        pt0Var4.q0(null, true);
                        return;
                    default:
                        pt0Var.q0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = d3.k(frameLayout2, textView2, kb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f48373o1 = k10;
        k10.setBackground(y6.g0(822083583, 7, -1));
        k10.setPadding(d3.h(8.0f, R.string.Clear, k10), 0, AndroidUtilities.dp(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setTextSize(1, 16.0f);
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pt0 pt0Var2 = pt0Var;
                        c0 c0Var2 = pt0Var2.L0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof rg.l)) {
                            c0Var2.b();
                            pt0Var2.f48368i1.setSelectedIndex(1);
                            pt0Var2.i((rg.m) rg.m.f47500a.get(0));
                            return;
                        }
                        pt0Var2.f48384u0.c();
                        return;
                    case 1:
                        pt0 pt0Var3 = pt0Var;
                        c0 c0Var3 = pt0Var3.L0;
                        rg.t1 t1Var2 = pt0Var3.f48384u0;
                        if (t1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof rg.l)) {
                                c0Var3.b();
                                pt0Var3.f48368i1.setSelectedIndex(1);
                                pt0Var3.i((rg.m) rg.m.f47500a.get(0));
                            }
                            c0Var3.a();
                            t1Var2.f47599c.clear();
                            t1Var2.f47598b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            pt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        pt0 pt0Var4 = pt0Var;
                        j jVar = pt0Var4.H0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (pt0Var4.V1) {
                            pt0Var4.k0(false);
                        }
                        pt0Var4.p0(pt0Var4.H0);
                        pt0Var4.q0(null, true);
                        return;
                    default:
                        pt0Var.q0(null, true);
                        return;
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = d3.k(frameLayout2, k10, kb1.h(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f48375p1 = k11;
        k11.setBackground(y6.g0(822083583, 7, -1));
        k11.setPadding(d3.h(8.0f, R.string.Done, k11), 0, AndroidUtilities.dp(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(AndroidUtilities.bold());
        k11.setTextSize(1, 16.0f);
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pt0 pt0Var2 = pt0Var;
                        c0 c0Var2 = pt0Var2.L0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof rg.l)) {
                            c0Var2.b();
                            pt0Var2.f48368i1.setSelectedIndex(1);
                            pt0Var2.i((rg.m) rg.m.f47500a.get(0));
                            return;
                        }
                        pt0Var2.f48384u0.c();
                        return;
                    case 1:
                        pt0 pt0Var3 = pt0Var;
                        c0 c0Var3 = pt0Var3.L0;
                        rg.t1 t1Var2 = pt0Var3.f48384u0;
                        if (t1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof rg.l)) {
                                c0Var3.b();
                                pt0Var3.f48368i1.setSelectedIndex(1);
                                pt0Var3.i((rg.m) rg.m.f47500a.get(0));
                            }
                            c0Var3.a();
                            t1Var2.f47599c.clear();
                            t1Var2.f47598b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            pt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        pt0 pt0Var4 = pt0Var;
                        j jVar = pt0Var4.H0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (pt0Var4.V1) {
                            pt0Var4.k0(false);
                        }
                        pt0Var4.p0(pt0Var4.H0);
                        pt0Var4.q0(null, true);
                        return;
                    default:
                        pt0Var.q0(null, true);
                        return;
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout2.addView(k11, kb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        k0 k0Var = new k0(pt0Var, context);
        this.R0 = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        k0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(k0Var, kb1.i(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s1 s1Var = new s1(context, z10);
        this.f48368i1 = s1Var;
        s1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s1Var.setDelegate(this);
        s1Var.setSelectedIndex(1);
        k0Var.addView(s1Var, kb1.g(48.0f, -1));
        p1 p1Var = new p1(context);
        this.f48369j1 = p1Var;
        p1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        p1Var.setVisibility(8);
        p1Var.setDelegate(this);
        p1Var.setAlignment(rg.s0.e(i10).f47582g);
        k0Var.addView(p1Var, kb1.g(48.0f, -1));
        i0 i0Var = new i0(pt0Var, context);
        this.S0 = i0Var;
        addView(i0Var, kb1.g(-1.0f, -1));
        u1 u1Var = new u1(context);
        this.f48370k1 = u1Var;
        u1Var.setVisibility(8);
        u1Var.setOnItemClickListener(new ai.k(pt0Var, 19));
        p1Var.setTypefaceListView(u1Var);
        i0Var.addView(u1Var, kb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f48377q1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f48377q1.setColor(1728053247);
        this.f48377q1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.f48379r1.setColor(y6.w0(y6.G8, this.F1));
        j0 j0Var = new j0(pt0Var, context);
        this.f48387v1 = j0Var;
        j0Var.setVisibility(8);
        j0Var.setColorPalette(rg.s0.e(i10));
        j0Var.setColorListener(new m(pt0Var, 0));
        k0Var.addView(j0Var, kb1.h(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        g1 g1Var = new g1(context);
        this.f48374p0 = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        g1Var.setBackground(y6.g0(1090519039, 1, -1));
        k0Var.addView(g1Var, kb1.h(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        k1 k1Var = new k1(context);
        this.f48376q0 = k1Var;
        k1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        k1Var.setBackground(y6.g0(1090519039, 1, -1));
        k1Var.setOnClickListener(new b51(pt0Var, context, bitmap2, 2));
        k0Var.addView(k1Var, kb1.h(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        x1 x1Var = new x1(context);
        this.f48358a1 = x1Var;
        x1Var.setColorSwatch(this.f48395z1);
        x1Var.setRenderView(this.L0);
        x1Var.setValueOverride(this.f48359b1);
        this.f48395z1.f47562c = this.f48359b1.get();
        x1Var.setOnUpdate(new yg1(pt0Var, i10, 10));
        addView(x1Var, kb1.g(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.T0 = frameLayout3;
        addView(frameLayout3, kb1.g(-1.0f, -1));
        this.f48393y1.setStyle(style);
        this.f48393y1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        r0(this.f48395z1, null);
        i((rg.m) rg.m.f47500a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void X(pt0 pt0Var, Integer num) {
        pt0Var.setNewColor(num.intValue());
        pt0Var.v0(false);
    }

    public static void Y(sg.m0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: sg.m0.Y(sg.m0):void");
    }

    public static void Z(m0 m0Var) {
        p2 p2Var;
        g0 g0Var = m0Var.O0;
        j jVar = m0Var.H0;
        if (jVar != null) {
            PointF z02 = m0Var.z0(jVar);
            j jVar2 = m0Var.H0;
            if (jVar2 instanceof p2) {
                p2 p2Var2 = new p2(m0Var.getContext(), (p2) m0Var.H0, z02);
                p2Var2.setDelegate(m0Var);
                g0Var.addView(p2Var2);
                p2Var = p2Var2;
            } else if (jVar2 instanceof w2) {
                w2 w2Var = new w2(m0Var.getContext(), (w2) m0Var.H0, z02);
                w2Var.setDelegate(m0Var);
                w2Var.setMaxWidth((int) (m0Var.getPaintingSize().f32392a - 20.0f));
                g0Var.addView(w2Var, kb1.g(-2.0f, -2));
                p2Var = w2Var;
            } else {
                p2Var = null;
            }
            m0Var.o0(p2Var);
            m0Var.q0(p2Var, true);
        }
        org.telegram.ui.ActionBar.o1 o1Var = m0Var.G1;
        if (o1Var != null && o1Var.isShowing()) {
            m0Var.G1.d(true);
        }
    }

    public static void a0(pt0 pt0Var, Integer num) {
        rg.s0 s0Var = pt0Var.K1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        pt0Var.setNewColor(num.intValue());
        j0 j0Var = pt0Var.f48387v1;
        j0Var.setSelectedColorIndex(s0Var.d());
        j0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.V0 == 2) {
            return this.f48369j1;
        }
        return this.f48368i1;
    }

    private int getFrameRotation() {
        int i10 = this.f48363d1;
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

    private rw0 getPaintingSize() {
        int i10;
        rw0 rw0Var = this.G0;
        if (rw0Var != null) {
            return rw0Var;
        }
        Bitmap bitmap = this.f48380s0;
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
        rw0 rw0Var2 = new rw0(width, height);
        float f7 = i10;
        rw0Var2.f32392a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        rw0Var2.f32393b = floor;
        if (floor > f7) {
            rw0Var2.f32393b = f7;
            rw0Var2.f32392a = (float) Math.floor((f7 * width) / height);
        }
        this.G0 = rw0Var2;
        return rw0Var2;
    }

    public void setNewColor(int i10) {
        rg.q1 q1Var = this.f48395z1;
        int i11 = q1Var.f47560a;
        q1Var.f47560a = i10;
        r0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new t4(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.J0 = i10;
        j jVar = this.H0;
        if (jVar instanceof w2) {
            ((w2) jVar).setType(i10);
        }
        rg.s0 e = rg.s0.e(this.E1);
        e.h = i10;
        e.f47578a.edit().putInt("text_type", i10).apply();
        this.f48369j1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        l5 l5Var = new l5(this, context);
        this.U0 = l5Var;
        l5Var.setClipToPadding(false);
        this.U0.setOrientation(0);
        this.R0.addView(this.U0, kb1.h(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f48365f1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f48365f1;
        int i10 = y6.f23449i6;
        u uVar = this.F1;
        f7.R(textView2, y6.g0(y6.w0(i10, uVar), 7, -1), null, f7.N(i10), uVar);
        this.f48365f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f48365f1.setTextColor(-1);
        this.f48365f1.setTextSize(1, 14.0f);
        this.f48365f1.setGravity(1);
        this.f48365f1.setTypeface(AndroidUtilities.bold());
        this.f48365f1.setSingleLine();
        this.f48365f1.setOnClickListener(new k(this, 0));
        this.U0.addView(this.f48365f1, kb1.p(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f48366g1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        f7.R(this.f48366g1, y6.g0(y6.w0(i10, uVar), 7, -1), null, f7.N(i10), uVar);
        this.f48366g1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f48366g1.setOnClickListener(new k(this, 1));
        this.f48366g1.setTextColor(-1);
        this.f48366g1.setTextSize(1, 14.0f);
        this.f48366g1.setGravity(1);
        this.f48366g1.setTypeface(AndroidUtilities.bold());
        this.f48366g1.setAlpha(0.6f);
        this.f48366g1.setSingleLine();
        this.U0.addView(this.f48366g1, kb1.p(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f48367h1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        f7.R(this.f48367h1, y6.g0(y6.w0(i10, uVar), 7, -1), null, f7.N(i10), uVar);
        this.f48367h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f48367h1.setTextColor(-1);
        this.f48367h1.setTextSize(1, 14.0f);
        this.f48367h1.setGravity(1);
        this.f48367h1.setTypeface(AndroidUtilities.bold());
        this.f48367h1.setAlpha(0.6f);
        this.f48367h1.setSingleLine();
        this.f48367h1.setOnClickListener(new k(this, 4));
        this.U0.addView(this.f48367h1, kb1.p(1.0f, 0, -2));
    }

    public static void t0(w2 w2Var, int i10) {
        int i11;
        w2Var.setAlign(i10);
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
        w2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        w2Var.getEditText().setTextAlignment(i12);
    }

    public final void A0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.V0 != i10 && this.W0 != i10) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.V0;
            ViewGroup viewGroup3 = this.f48369j1;
            ViewGroup viewGroup4 = this.f48368i1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.W0 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.E1;
            rg.s0 e = rg.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f47586l != z10) {
                e.f47586l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f47578a.getInt("brush", 0), false);
                }
            }
            int c10 = rg.s0.e(i12).c();
            rg.q1 q1Var = this.f48395z1;
            q1Var.f47560a = c10;
            r0(q1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.Y0 = duration;
            duration.setInterpolator(ds.f27530f);
            this.Y0.addUpdateListener(new n3(this, viewGroup, viewGroup2, 4));
            this.Y0.addListener(new m5(this, viewGroup, viewGroup2, i10, 2));
            this.Y0.start();
        }
    }

    public final void B0() {
        int i10 = 0;
        while (true) {
            g0 g0Var = this.O0;
            if (i10 < g0Var.getChildCount()) {
                View childAt = g0Var.getChildAt(i10);
                if (childAt != this.H0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f48293l0 && jVar.f48291j0 <= 0.0f) {
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
    public final void C() {
        y0(true);
    }

    @Override
    public final boolean D(j jVar) {
        return q0(jVar, true);
    }

    @Override
    public final void I(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.W1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.a2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.a2).commit();
            } else {
                this.Z1 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Z1).commit();
            }
        }
        if (this.V1) {
            if (z10) {
                i11 = this.a2;
            } else {
                i11 = this.Z1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U1.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.U1.setLayoutParams(layoutParams);
                this.Y1 = layoutParams.height;
                requestLayout();
                z3 z3Var = ((pt0) this).f42502d2.K1;
                if (z3Var != null) {
                    z3Var.a();
                }
                getHeight();
            }
        }
        if (this.f48360b2 == i10 && this.f48362c2 == z10) {
            getHeight();
            return;
        }
        this.f48360b2 = i10;
        this.f48362c2 = z10;
        boolean z13 = this.W1;
        j jVar = this.H0;
        if (jVar instanceof w2) {
            if (((w2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.W1 = z12;
        } else {
            this.W1 = false;
        }
        if (this.W1 && this.V1) {
            w0(0);
        }
        if (this.Y1 != 0 && !(z11 = this.W1) && z11 != z13 && !this.V1) {
            this.Y1 = 0;
            requestLayout();
            z3 z3Var2 = ((pt0) this).f42502d2.K1;
            if (z3Var2 != null) {
                z3Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        v0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G8));
        hashSet.add(Integer.valueOf(y6.f23428h5));
        hashSet.add(Integer.valueOf(y6.f23465j5));
        hashSet.add(Integer.valueOf(y6.f23615r5));
        hashSet.add(Integer.valueOf(y6.He));
        hashSet.add(Integer.valueOf(y6.Ke));
        hashSet.add(Integer.valueOf(y6.Ne));
        hashSet.add(Integer.valueOf(y6.Re));
        hashSet.add(Integer.valueOf(y6.Me));
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.Mh));
        hashSet.add(Integer.valueOf(y6.Fh));
        hashSet.add(Integer.valueOf(y6.Eh));
        hashSet.add(Integer.valueOf(y6.Gh));
        hashSet.add(Integer.valueOf(y6.Hh));
        hashSet.add(Integer.valueOf(y6.Je));
        hashSet.add(Integer.valueOf(y6.Ie));
        hashSet.add(Integer.valueOf(y6.f23300a7));
        hashSet.add(Integer.valueOf(y6.f23522m7));
        hashSet.add(Integer.valueOf(y6.f23504l7));
        hashSet.add(Integer.valueOf(y6.f23542n7));
        hashSet.add(Integer.valueOf(y6.f23357d6));
        hashSet.add(Integer.valueOf(y6.f23358d7));
    }

    @Override
    public final int[] b(j jVar) {
        return i0(jVar);
    }

    @Override
    public final void c() {
        setTextType((this.J0 + 1) % 4);
    }

    @Override
    public final void d(int i10) {
        j jVar = this.H0;
        if (jVar instanceof w2) {
            t0((w2) jVar, i10);
            rg.s0 e = rg.s0.e(this.E1);
            e.f47582g = i10;
            e.f47578a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new s9.g(1, this, (y1) view)).start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g0 g0Var;
        w2 w2Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (g0Var = this.O0) != null) {
            for (int i12 = 0; i12 < g0Var.getChildCount(); i12++) {
                View childAt = g0Var.getChildAt(i12);
                if ((childAt instanceof w2) && (str = (w2Var = (w2) childAt).A0) != null) {
                    w2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: sg.m0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final PointF e0() {
        MediaController.CropState cropState;
        rw0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f32392a / 2.0f;
        float f10 = paintingSize.f32393b / 2.0f;
        if (this.f48388w0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float a2 = (float) org.telegram.messenger.t.a(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f32392a;
            f10 -= a2 * paintingSize.f32393b;
        }
        return new PointF(f7, f10);
    }

    public final y1 f0(String str, boolean z10) {
        float f7;
        rw0 rw0Var;
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
        g0 g0Var = this.O0;
        if (i10 > 0) {
            float floor = (float) Math.floor(g0Var.getMeasuredWidth() * 0.5d);
            rw0Var = new rw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(g0Var.getMeasuredHeight() * 0.5d);
            rw0Var = new rw0(f7 * floor2, floor2);
        }
        rw0 rw0Var2 = rw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = rw0Var2.f32392a;
            rw0Var2.f32392a = rw0Var2.f32393b;
            rw0Var2.f32393b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        y1 y1Var = new y1(context, e02, rw0Var2, str, intValue);
        y1Var.setDelegate(this);
        g0Var.addView(y1Var);
        if (z10) {
            o0(y1Var);
            q0(y1Var, true);
        }
        return y1Var;
    }

    public final sg.z g0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: sg.m0.g0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):sg.z");
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.f48374p0;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.f48388w0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f48376q0;
    }

    public long getLcm() {
        return this.f48364e1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        c6[] c6VarArr;
        g0 g0Var = this.O0;
        int childCount = g0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = g0Var.getChildAt(i10);
            if (childAt instanceof p2) {
                TLRPC.Document sticker = ((p2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22040id = sticker.f22034id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof w2) {
                CharSequence text = ((w2) childAt).getText();
                if ((text instanceof Spanned) && (c6VarArr = (c6[]) ((Spanned) text).getSpans(0, text.length(), c6.class)) != null) {
                    for (c6 c6Var : c6VarArr) {
                        if (c6Var != null) {
                            TLRPC.Document document = c6Var.document;
                            if (document == null) {
                                document = t5.f(this.E1, c6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22040id = document.f22034id;
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
        return this.f48378r0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public rg.c1 getRenderView() {
        return this.L0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.H0;
        g0 g0Var = this.O0;
        if (jVar == null) {
            return getY() + g0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (g0Var.getScaleY() * this.H0.getHeight()) + iArr[1];
    }

    public h21 getThanosEffect() {
        if (!h21.c()) {
            return null;
        }
        if (this.P0 == null) {
            h21 h21Var = new h21(getContext(), new n(this, 0));
            this.P0 = h21Var;
            addView(h21Var);
        }
        return this.P0;
    }

    public final w2 h0(boolean z10) {
        ((pt0) this).f42502d2.f35688g0.isFocusable();
        rw0 paintingSize = getPaintingSize();
        PointF z02 = z0(null);
        w2 w2Var = new w2(getContext(), z02, (int) (paintingSize.f32392a / 9.0f), "", this.f48395z1, this.J0);
        float f7 = paintingSize.f32392a / 9.0f;
        n nVar = new n(this, 2);
        w2Var.f48594w0 = (int) (0.5f * f7);
        w2Var.f48595x0 = (int) (f7 * 2.0f);
        w2Var.f48596y0 = nVar;
        float f10 = z02.x;
        g0 g0Var = this.O0;
        if (f10 == g0Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (z02.y == g0Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth((int) (paintingSize.f32392a - 20.0f));
        int i10 = this.E1;
        w2Var.setTypeface(rg.s0.e(i10).f47584j);
        w2Var.setType(rg.s0.e(i10).h);
        g0Var.addView(w2Var, kb1.g(-2.0f, -2));
        MediaController.CropState cropState = this.f48388w0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            o0(w2Var);
            w2Var.q();
            q0(w2Var, false);
            w2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(w2Var.getFocusedView());
            this.I0 = true;
            int i11 = rg.s0.e(i10).f47582g;
            p1 p1Var = this.f48369j1;
            p1Var.d(i11, true);
            p1Var.setOutlineType(rg.s0.e(i10).h);
        }
        return w2Var;
    }

    @Override
    public final void i(rg.m mVar) {
        boolean z10 = mVar instanceof rg.b;
        x1 x1Var = this.f48358a1;
        if (!z10 && !(mVar instanceof rg.d)) {
            x1Var.b(0.05f, 1.0f);
        } else {
            x1Var.b(0.4f, 1.75f);
        }
        x1Var.setDrawCenter(!(mVar instanceof rg.l));
        c0 c0Var = this.L0;
        if (c0Var.getCurrentBrush() instanceof rg.l) {
            this.Z0 = true;
        }
        c0Var.setBrush(mVar);
        rg.q1 q1Var = this.f48395z1;
        int i10 = q1Var.f47560a;
        q1Var.f47560a = rg.s0.e(this.E1).c();
        q1Var.f47562c = this.f48359b1.get();
        r0(q1Var, Integer.valueOf(i10));
        this.M0.invalidate();
    }

    public final int[] i0(j jVar) {
        float[] fArr = this.S1;
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
        int[] iArr = this.T1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f7 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.O0.getRotation());
        double d10 = f7;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) org.telegram.messenger.t.a(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (this.H0 != null) {
            q0(null, true);
        }
        float x9 = motionEvent.getX();
        c0 c0Var = this.L0;
        float translationX = ((x9 - c0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - c0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / c0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (c0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (c0Var.getMeasuredHeight() / 2.0f) + ((float) org.telegram.messenger.t.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int j0(boolean z10) {
        return this.Y1;
    }

    @Override
    public final void k(j jVar) {
        int[] i02 = i0(jVar);
        x0(new s(this, jVar, 1), this, 51, i02[0], i02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void k0(boolean z10) {
        if (this.V1) {
            w0(0);
        }
        if (z10) {
            sz szVar = this.U1;
            if (szVar != null && szVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.U1.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.X1 = true;
                ofFloat.addListener(new a0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22964w);
                ofFloat.start();
                return;
            }
            l0();
        }
    }

    public final void l0() {
        sz szVar;
        z3 z3Var;
        if (this.Y1 > 0 && (z3Var = ((pt0) this).f42502d2.K1) != null) {
            z3Var.a();
        }
        if (!this.V1 && (szVar = this.U1) != null && szVar.getVisibility() != 8) {
            this.U1.setVisibility(8);
        }
        this.Y1 = 0;
    }

    public final void m0(boolean z10) {
        int i10;
        int i11;
        if (this.V0 == 0) {
            int i12 = 0;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.f48358a1.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.R0.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.Q0.setLayerType(i12, null);
        }
    }

    public final boolean n0() {
        if (this.A1) {
            v0(false);
            return true;
        } else if (this.V1) {
            k0(true);
            return true;
        } else if (!this.I0) {
            return false;
        } else {
            q0(null, true);
            return true;
        }
    }

    public final void o0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.f48384u0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int Q;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        if (this.U1 != null) {
            if (AndroidUtilities.isTablet()) {
                Q = i15 - this.U1.getMeasuredHeight();
            } else {
                Q = (Q() + i15) - this.U1.getMeasuredHeight();
            }
            sz szVar = this.U1;
            szVar.layout(0, Q, szVar.getMeasuredWidth(), this.U1.getMeasuredHeight() + Q);
        }
        if (!this.K0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        c0 c0Var = this.L0;
        int ceil = (int) Math.ceil((i14 - c0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.t.D(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - c0Var.getMeasuredHeight()) / 2, i16);
        c0Var.layout(ceil, additionalTop, c0Var.getMeasuredWidth() + ceil, c0Var.getMeasuredHeight() + additionalTop);
        e0 e0Var = this.M0;
        e0Var.layout(ceil, additionalTop, e0Var.getMeasuredWidth() + ceil, e0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = c0Var.getMeasuredWidth();
        g0 g0Var = this.O0;
        int measuredWidth2 = ((measuredWidth - g0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((c0Var.getMeasuredHeight() - g0Var.getMeasuredHeight()) / 2) + additionalTop;
        g0Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
        h21 h21Var = this.P0;
        if (h21Var != null) {
            h21Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
        }
        h0 h0Var = this.N0;
        h0Var.layout(ceil, additionalTop, h0Var.getMeasuredWidth() + ceil, h0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.E0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f48380s0;
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
        this.L0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.M0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f12 = f10 / this.G0.f32392a;
        this.F0 = f12;
        g0 g0Var = this.O0;
        g0Var.setScaleX(f12);
        g0Var.setScaleY(this.F0);
        g0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.G0.f32392a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.G0.f32393b, 1073741824));
        h21 h21Var = this.P0;
        if (h21Var != null) {
            h21Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.G0.f32392a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.G0.f32393b, 1073741824));
            this.P0.setScaleX(this.F0);
            this.P0.setScaleY(this.F0);
        }
        B0();
        this.N0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.R0, i10, i11);
        measureChild(this.f48358a1, i10, i11);
        measureChild(this.T0, i10, i11);
        measureChild(this.S0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.Y1), 1073741824));
        FrameLayout frameLayout = this.Q0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.E0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.V1 && !this.X1) {
            this.E0 = true;
            l0();
            this.E0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            l0();
        }
        sz szVar = this.U1;
        if (szVar != null) {
            measureChild(szVar, i10, i11);
        }
    }

    public final void p0(j jVar) {
        j jVar2 = this.H0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.H0 = null;
            if (jVar instanceof w2) {
                ValueAnimator valueAnimator = this.Y0;
                if (valueAnimator != null && this.W0 != 0) {
                    valueAnimator.cancel();
                }
                A0(0);
            }
        }
        this.O0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            rg.t1 t1Var = this.f48384u0;
            t1Var.f47598b.remove(uuid);
            t1Var.f47599c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var, 12));
        }
        x1 x1Var = this.f48358a1;
        h5 h5Var = this.f48359b1;
        x1Var.setValueOverride(h5Var);
        x1Var.setShowPreview(true);
        float f7 = h5Var.get();
        rg.q1 q1Var = this.f48395z1;
        q1Var.f47562c = f7;
        r0(q1Var, null);
    }

    @Override
    public final boolean q() {
        return true;
    }

    public final boolean q0(j jVar, boolean z10) {
        m0 m0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof w2;
        int i11 = 2;
        if (z12 && (((i10 = this.W0) == -1 && this.V0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.A1) {
                v0(false);
            }
            A0(2);
        }
        if (z12 && z10) {
            w2 w2Var = (w2) jVar;
            int gravity = w2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            p1 p1Var = this.f48369j1;
            p1Var.setAlignment(i11);
            p1Var.setTypeface(w2Var.getTypeface().f47475a);
            p1Var.e(w2Var.getType(), true);
            this.S0.invalidate();
        }
        j jVar2 = this.H0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.I0) {
                    int[] i02 = i0(jVar2);
                    x0(new s(this, jVar2, 1), this, 51, i02[0], i02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof w2) {
                    AndroidUtilities.showKeyboard(((w2) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            m0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = m0Var.H0;
            if (jVar3 instanceof w2) {
                w2 w2Var2 = (w2) jVar3;
                v2 v2Var = w2Var2.f48588q0;
                v2Var.clearFocus();
                v2Var.setEnabled(false);
                v2Var.setClickable(false);
                w2Var2.m();
                if (!z12) {
                    m0Var.I0 = false;
                    AndroidUtilities.hideKeyboard(((w2) m0Var.H0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        } else {
            m0Var = this;
            z11 = false;
        }
        j jVar4 = m0Var.H0;
        m0Var.H0 = jVar;
        if ((jVar4 instanceof w2) && TextUtils.isEmpty(((w2) jVar4).getText())) {
            p0(jVar4);
        }
        j jVar5 = m0Var.H0;
        h5 h5Var = m0Var.f48359b1;
        rg.q1 q1Var = m0Var.f48395z1;
        x1 x1Var = m0Var.f48358a1;
        if (jVar5 != null) {
            h0 h0Var = m0Var.N0;
            jVar5.m0 = h0Var;
            jVar5.l(h0Var, true);
            m0Var.O0.bringChildToFront(m0Var.H0);
            j jVar6 = m0Var.H0;
            if (jVar6 instanceof w2) {
                w2 w2Var3 = (w2) jVar6;
                w2Var3.f48597z0 = false;
                w2Var3.getSwatch().f47562c = q1Var.f47562c;
                r0(w2Var3.getSwatch(), null);
                x1Var.setValueOverride(new i5(w2Var3, (int) (m0Var.G0.f32392a / 9.0f), 1));
                x1Var.setShowPreview(false);
                return true;
            }
            x1Var.setValueOverride(h5Var);
            x1Var.setShowPreview(true);
            q1Var.f47562c = h5Var.get();
            r0(q1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = m0Var.Y0;
        if (valueAnimator2 != null && m0Var.W0 != 0) {
            valueAnimator2.cancel();
        }
        if (m0Var.A1) {
            v0(false);
        }
        A0(0);
        x1Var.setValueOverride(h5Var);
        x1Var.setShowPreview(true);
        q1Var.f47562c = h5Var.get();
        r0(q1Var, null);
        return z11;
    }

    @Override
    public final boolean r() {
        return !this.I0;
    }

    public final void r0(rg.q1 q1Var, Integer num) {
        rg.q1 q1Var2 = this.f48395z1;
        if (q1Var2 != q1Var) {
            q1Var2.f47560a = q1Var.f47560a;
            q1Var2.f47561b = q1Var.f47561b;
            q1Var2.f47562c = q1Var.f47562c;
            int i10 = this.E1;
            rg.s0.e(i10).h(q1Var.f47560a, true);
            rg.s0.e(i10).j(q1Var.f47562c);
        }
        int i11 = q1Var.f47560a;
        c0 c0Var = this.L0;
        c0Var.setColor(i11);
        c0Var.setBrushSize(q1Var.f47562c);
        int i12 = q1Var2.f47560a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new n4(this, num, i12, 2));
            duration.start();
        } else {
            k0 k0Var = this.R0;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        }
        j jVar = this.H0;
        if (jVar instanceof w2) {
            ((w2) jVar).setSwatch(new rg.q1(q1Var.f47561b, q1Var.f47562c, q1Var.f47560a));
        }
    }

    @Override
    public final void requestLayout() {
        if (this.E0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(float f7) {
        this.f48378r0 = f7;
        this.Q0.setTranslationY(-f7);
        this.R0.setTranslationY(f7);
    }

    public void setBlurredBackgroundDrawableForTools(eh.d dVar) {
        dVar.w(AndroidUtilities.dp(4.0f));
        this.R1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.L1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.V0 == 0) {
            this.f48358a1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.J1 = runnable;
    }

    @Override
    public final void u() {
        z3 z3Var;
        if (!this.W1 && !this.V1) {
            h0(true);
            return;
        }
        boolean z10 = this.V1;
        if (z10 && (z3Var = ((pt0) this).f42502d2.K1) != null) {
            z3Var.e = true;
        }
        w0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.H0;
            if (jVar instanceof w2) {
                AndroidUtilities.showKeyboard(((w2) jVar).getEditText());
            }
        }
    }

    public final void u0(float f7, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        this.f48390x0 = f7;
        this.C0 = f12;
        this.D0 = f13;
        this.f48392y0 = f10;
        this.f48394z0 = f11;
        this.A0 = f10;
        float f21 = f11 + 0.0f;
        this.B0 = f21;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                view = this.O0;
            } else if (i10 == 1) {
                view = this.N0;
            } else if (i10 == 2) {
                view = this.L0;
            } else {
                view = this.M0;
            }
            MediaController.CropState cropState = this.f48388w0;
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
                    float E = c3.h0.E(cropState.cropPx, measuredWidth, f7, max);
                    float f23 = cropState.cropScale;
                    f16 = (E * f23) + f10;
                    f14 = 1.0f;
                    f17 = (cropState.cropPy * measuredHeight * f7 * max * f23) + f21;
                    f18 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                f14 = 1.0f;
                if (i10 == 0) {
                    f15 = this.F0 * 1.0f;
                } else {
                    f15 = 1.0f;
                }
                f16 = f10;
                f17 = f21;
                f18 = 0.0f;
            }
            float f24 = ((-this.Y1) / 2.0f) + f17;
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
        B0();
        invalidate();
    }

    @Override
    public final void updateColors() {
        this.D1.setColor(-15132391);
    }

    @Override
    public final void v(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.O0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) org.telegram.messenger.t.a(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.j jVar = this.B1;
            if (jVar != null) {
                jVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new ac.a(f7));
            this.B1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f18974i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18968u = kVar;
            if (!this.W1 && !this.V1) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.R0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.B1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    m0 m0Var = m0.this;
                    k0 k0Var = m0Var.R0;
                    float f13 = f11 / 1000.0f;
                    m0Var.C1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(m0Var.C1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(m0Var.C1, 0.25f) / 0.25f));
                    j0 j0Var = m0Var.f48387v1;
                    float f15 = m0Var.C1;
                    boolean z12 = z10;
                    j0Var.E1(f15, z12);
                    m0Var.f48376q0.setProgress(m0Var.C1);
                    m0Var.f48374p0.setProgress(m0Var.C1);
                    m0Var.U0.setTranslationY(AndroidUtilities.dp(32.0f) * m0Var.C1);
                    if (zArr[0]) {
                        float f16 = m0Var.C1;
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
                    if (view == m0Var.f48369j1) {
                        m0Var.S0.invalidate();
                    }
                }
            });
            this.B1.a(new r(this, z10, 1));
            this.B1.h();
            if (z10) {
                j0 j0Var = this.f48387v1;
                j0Var.setVisibility(0);
                j0Var.setSelectedColorIndex(rg.s0.e(this.E1).d());
            }
        }
    }

    @Override
    public final rg.s0 w() {
        return rg.s0.e(this.E1);
    }

    public final void w0(int i10) {
        boolean z10;
        int i11;
        p1 p1Var = this.f48369j1;
        if (i10 == 1) {
            sz szVar = this.U1;
            if (szVar != null && szVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sz szVar2 = this.U1;
            if (szVar2 != null && szVar2.f32713c1 != UserConfig.selectedAccount) {
                removeView(szVar2);
                this.U1 = null;
            }
            if (this.U1 == null) {
                sz szVar3 = new sz(null, true, false, false, getContext(), false, null, null, true, this.F1, false, false);
                this.U1 = szVar3;
                szVar3.U0 = true;
                szVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.U1.setForseMultiwindowLayout(true);
                }
                this.U1.setDelegate(new b0(this));
                addView(this.U1);
            }
            this.U1.setVisibility(0);
            this.V1 = true;
            sz szVar4 = this.U1;
            if (this.Z1 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.Z1 = AndroidUtilities.dp(150.0f);
                } else {
                    this.Z1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.a2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.a2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.a2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.a2;
            } else {
                i11 = this.Z1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) szVar4.getLayoutParams();
            layoutParams.height = i11;
            szVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.H0;
                if (jVar instanceof w2) {
                    AndroidUtilities.hideKeyboard(((w2) jVar).getEditText());
                }
            }
            this.Y1 = i11;
            requestLayout();
            z3 z3Var = ((pt0) this).f42502d2.K1;
            if (z3Var != null) {
                z3Var.a();
            }
            ah emojiButton = p1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            getHeight();
            if (!z10 && !this.W1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y1, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new a0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        ah emojiButton2 = p1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(yg.e, true);
        }
        sz szVar5 = this.U1;
        if (szVar5 != null) {
            this.V1 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                szVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.Y1 = 0;
        }
        z3 z3Var2 = ((pt0) this).f42502d2.K1;
        if (z3Var2 != null) {
            z3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void x0(Runnable runnable, m0 m0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.o1 o1Var = this.G1;
        if (o1Var != null && o1Var.isShowing()) {
            this.G1.d(true);
            return;
        }
        if (this.H1 == null) {
            this.I1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.F1);
            this.H1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.H1.setBackgroundColor(-14145495);
            this.H1.setOnTouchListener(new w4(this, 1));
            this.H1.setDispatchKeyEventListener(new q(this));
            this.H1.setShownFromBottom(true);
        }
        this.H1.d();
        runnable.run();
        if (this.G1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.H1, -2, -2);
            this.G1 = o1Var2;
            o1Var2.f22909b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.G1.setOutsideTouchable(true);
            this.G1.setClippingEnabled(true);
            this.G1.setInputMethodMode(2);
            this.G1.setSoftInputMode(0);
            this.G1.getContentView().setFocusableInTouchMode(true);
            this.G1.setOnDismissListener(new y4(this, 1));
        }
        this.H1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.G1.setFocusable(true);
        this.G1.showAtLocation(m0Var, i10, i11 - (this.H1.getMeasuredWidth() / 2), i12 - this.H1.getMeasuredHeight());
        org.telegram.ui.ActionBar.o1.i(this.H1);
    }

    public final void y0(boolean z10) {
        float f7;
        if (this.f48383t1 != z10) {
            this.f48383t1 = z10;
            o1.j jVar = this.f48385u1;
            if (jVar != null) {
                jVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new ac.a(f7));
            this.f48385u1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f18974i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18968u = kVar;
            if (z10) {
                u1 u1Var = this.f48370k1;
                u1Var.setAlpha(0.0f);
                u1Var.setVisibility(0);
            }
            this.f48385u1.b(new i8(3, this));
            this.f48385u1.a(new r(this, z10, 0));
            this.f48385u1.h();
        }
    }

    @Override
    public final void z() {
        x0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF z0(j jVar) {
        float f7 = 200.0f;
        MediaController.CropState cropState = this.f48388w0;
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
        PointF e02 = e0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                g0 g0Var = this.O0;
                if (i10 >= g0Var.getChildCount()) {
                    break;
                }
                View childAt = g0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return e02;
            }
            e02 = new PointF(e02.x + f7, e02.y + f7);
        }
    }

    @Override
    public final void B() {
    }

    @Override
    public final void g() {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public final void l(boolean z10) {
    }
}
