package qg;

import ai.qa;
import ai.x4;
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
import ci.d5;
import ci.h5;
import ci.j4;
import ci.j5;
import ci.u5;
import ci.x5;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ai1;
import org.telegram.ui.au0;
import org.telegram.ui.jr0;
import w7.y5;
public abstract class m0 extends cw0 implements q1, h, m1, aw0, NotificationCenter.NotificationCenterDelegate {
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
    public final pg.v1 F0;
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
    public final pg.s1 K1;
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
    public final eh.a Q1;
    public vv0 R0;
    public org.telegram.ui.ActionBar.n1 R1;
    public j S0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout S1;
    public boolean T0;
    public Rect T1;
    public int U0;
    public Runnable U1;
    public final boolean V0;
    public final pg.u0 V1;
    public final c0 W0;
    public boolean W1;
    public final e0 X0;
    public float X1;
    public final h0 Y0;
    public boolean Y1;
    public final g0 Z0;
    public final e6 Z1;
    public m11 f41737a1;
    public final Paint a2;
    public final FrameLayout f41738b1;
    public final Paint f41739b2;
    public final k0 f41740c1;
    public ch.d f41741c2;
    public final i0 f41742d1;
    public final float[] f41743d2;
    public final FrameLayout f41744e1;
    public final int[] f41745e2;
    public x5 f41746f1;
    public kz f41747f2;
    public int f41748g1;
    public boolean f41749g2;
    public int f41750h1;
    public boolean f41751h2;
    public float f41752i1;
    public boolean f41753i2;
    public ValueAnimator f41754j1;
    public int f41755j2;
    public boolean f41756k1;
    public int f41757k2;
    public final w1 l1;
    public int f41758l2;
    public final ka.c f41759m1;
    public int f41760m2;
    public ArrayList f41761n1;
    public boolean f41762n2;
    public final int f41763o1;
    public BigInteger f41764p1;
    public TextView f41765q1;
    public TextView f41766r1;
    public TextView f41767s1;
    public final r1 f41768t1;
    public final o1 f41769u1;
    public final t1 f41770v1;
    public final ImageView f41771w1;
    public final LinearLayout f41772x1;
    public final TextView f41773y1;
    public final TextView f41774z1;

    public m0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, jr0 jr0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, activity);
        boolean z10;
        float f7;
        int i12;
        int i13;
        Emoji.EmojiSpan[] emojiSpanArr;
        x1 x1Var;
        boolean z11 = false;
        this.f41748g1 = 0;
        this.f41750h1 = -1;
        final au0 au0Var = (au0) this;
        this.f41759m1 = new ka.c(au0Var, 16);
        byte b10 = 1;
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.H1 = new Paint(1);
        this.I1 = new Paint(1);
        this.J1 = new Paint(1);
        pg.s1 s1Var = new pg.s1(1.0f, 0.016773745f, -1);
        this.K1 = s1Var;
        this.O1 = new Paint(1);
        this.Y1 = false;
        this.Z1 = new e6((View) this, 350L, qr.h);
        this.a2 = new Paint(1);
        Paint paint = new Paint(1);
        this.f41739b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.f41743d2 = new float[2];
        this.f41745e2 = new int[2];
        new p8.b(au0Var, 2);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new eh.a(3, e6Var);
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        pg.u0 e = pg.u0.e(i10);
        this.V1 = e;
        e.i(0, true);
        s1Var.f41242a = e.c();
        s1Var.f41244c = e.f41267i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.f41763o1 = i11;
        pg.v1 v1Var = new pg.v1();
        this.F0 = v1Var;
        v1Var.f41280a = new k2.v(au0Var, 19);
        c0 c0Var = new c0(au0Var, context, new pg.s0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = c0Var;
        c0Var.setDelegate(new d0(au0Var, jr0Var));
        c0Var.setUndoStore(v1Var);
        c0Var.setQueue(dispatchQueue);
        c0Var.setVisibility(4);
        addView(c0Var, y5.e(-1, -1, 51));
        e0 e0Var = new e0(au0Var, context);
        this.X0 = e0Var;
        e0Var.setVisibility(4);
        addView(e0Var, y5.e(-1, -1, 51));
        g0 g0Var = new g0(au0Var, context, new f0(au0Var));
        this.Z0 = g0Var;
        addView(g0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    f7 = 2.0f;
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    i13 = i14;
                    x1Var = i02;
                } else {
                    f7 = 2.0f;
                    if (b11 == b10) {
                        ?? j02 = j0(z11);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i15);
                            i15++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            int i16 = size;
                            z5 z5Var = new z5(emojiEntity2.document_id, j02.getFontMetricsInt());
                            int i17 = emojiEntity2.offset;
                            spannableString.setSpan(z5Var, i17, emojiEntity2.length + i17, 33);
                            i14 = i14;
                            size2 = size2;
                            size = i16;
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
                        u0(j02, mediaEntity.textAlign);
                        pg.s1 swatch = j02.getSwatch();
                        swatch.f41242a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        x1Var = j02;
                    } else {
                        i12 = size;
                        i13 = i14;
                        if (b11 == 2) {
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
                            i14 = i13 + 1;
                            size = i12;
                            z11 = false;
                            b10 = 1;
                        }
                    }
                }
                x1Var.setX((mediaEntity.f15813x * this.R0.f29776a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f7));
                x1Var.setY((mediaEntity.f15814y * this.R0.f29777b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f7));
                x1Var.setPosition(new PointF((mediaEntity.viewWidth / f7) + x1Var.getX(), (mediaEntity.viewHeight / f7) + x1Var.getY()));
                x1Var.setScale(mediaEntity.scale);
                x1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i14 = i13 + 1;
                size = i12;
                z11 = false;
                b10 = 1;
            }
        }
        this.Z0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.Y0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.f41738b1 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, y5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f41771w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        au0 au0Var2 = au0Var;
                        c0 c0Var2 = au0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof pg.l)) {
                            c0Var2.b();
                            au0Var2.f41768t1.setSelectedIndex(1);
                            au0Var2.b((pg.m) pg.m.f41158a.get(0));
                            return;
                        }
                        au0Var2.F0.c();
                        return;
                    case 1:
                        au0 au0Var3 = au0Var;
                        c0 c0Var3 = au0Var3.W0;
                        pg.v1 v1Var2 = au0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof pg.l)) {
                                c0Var3.b();
                                au0Var3.f41768t1.setSelectedIndex(1);
                                au0Var3.b((pg.m) pg.m.f41158a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f41282c.clear();
                            v1Var2.f41281b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(v1Var2, 12));
                            au0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        au0 au0Var4 = au0Var;
                        j jVar = au0Var4.S0;
                        if (jVar instanceof u2) {
                            AndroidUtilities.hideKeyboard(((u2) jVar).getFocusedView());
                        }
                        if (au0Var4.f41749g2) {
                            au0Var4.l0(false);
                        }
                        au0Var4.q0(au0Var4.S0);
                        au0Var4.r0(null, true);
                        return;
                    default:
                        au0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, y5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41772x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        wh.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, y5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, y5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.e2(22));
        frameLayout2.addView(linearLayout, y5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f41773y1 = textView2;
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
                        au0 au0Var2 = au0Var;
                        c0 c0Var2 = au0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof pg.l)) {
                            c0Var2.b();
                            au0Var2.f41768t1.setSelectedIndex(1);
                            au0Var2.b((pg.m) pg.m.f41158a.get(0));
                            return;
                        }
                        au0Var2.F0.c();
                        return;
                    case 1:
                        au0 au0Var3 = au0Var;
                        c0 c0Var3 = au0Var3.W0;
                        pg.v1 v1Var2 = au0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof pg.l)) {
                                c0Var3.b();
                                au0Var3.f41768t1.setSelectedIndex(1);
                                au0Var3.b((pg.m) pg.m.f41158a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f41282c.clear();
                            v1Var2.f41281b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(v1Var2, 12));
                            au0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        au0 au0Var4 = au0Var;
                        j jVar = au0Var4.S0;
                        if (jVar instanceof u2) {
                            AndroidUtilities.hideKeyboard(((u2) jVar).getFocusedView());
                        }
                        if (au0Var4.f41749g2) {
                            au0Var4.l0(false);
                        }
                        au0Var4.q0(au0Var4.S0);
                        au0Var4.r0(null, true);
                        return;
                    default:
                        au0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout2, textView2, y5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f41774z1 = g10;
        g10.setBackground(j6.f0(822083583, 7, -1));
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
                        au0 au0Var2 = au0Var;
                        c0 c0Var2 = au0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof pg.l)) {
                            c0Var2.b();
                            au0Var2.f41768t1.setSelectedIndex(1);
                            au0Var2.b((pg.m) pg.m.f41158a.get(0));
                            return;
                        }
                        au0Var2.F0.c();
                        return;
                    case 1:
                        au0 au0Var3 = au0Var;
                        c0 c0Var3 = au0Var3.W0;
                        pg.v1 v1Var2 = au0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof pg.l)) {
                                c0Var3.b();
                                au0Var3.f41768t1.setSelectedIndex(1);
                                au0Var3.b((pg.m) pg.m.f41158a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f41282c.clear();
                            v1Var2.f41281b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(v1Var2, 12));
                            au0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        au0 au0Var4 = au0Var;
                        j jVar = au0Var4.S0;
                        if (jVar instanceof u2) {
                            AndroidUtilities.hideKeyboard(((u2) jVar).getFocusedView());
                        }
                        if (au0Var4.f41749g2) {
                            au0Var4.l0(false);
                        }
                        au0Var4.q0(au0Var4.S0);
                        au0Var4.r0(null, true);
                        return;
                    default:
                        au0Var.r0(null, true);
                        return;
                }
            }
        });
        g10.setAlpha(0.0f);
        g10.setVisibility(8);
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout2, g10, y5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.A1 = g11;
        g11.setBackground(j6.f0(822083583, 7, -1));
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
                        au0 au0Var2 = au0Var;
                        c0 c0Var2 = au0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof pg.l)) {
                            c0Var2.b();
                            au0Var2.f41768t1.setSelectedIndex(1);
                            au0Var2.b((pg.m) pg.m.f41158a.get(0));
                            return;
                        }
                        au0Var2.F0.c();
                        return;
                    case 1:
                        au0 au0Var3 = au0Var;
                        c0 c0Var3 = au0Var3.W0;
                        pg.v1 v1Var2 = au0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof pg.l)) {
                                c0Var3.b();
                                au0Var3.f41768t1.setSelectedIndex(1);
                                au0Var3.b((pg.m) pg.m.f41158a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f41282c.clear();
                            v1Var2.f41281b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(v1Var2, 12));
                            au0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        au0 au0Var4 = au0Var;
                        j jVar = au0Var4.S0;
                        if (jVar instanceof u2) {
                            AndroidUtilities.hideKeyboard(((u2) jVar).getFocusedView());
                        }
                        if (au0Var4.f41749g2) {
                            au0Var4.l0(false);
                        }
                        au0Var4.q0(au0Var4.S0);
                        au0Var4.r0(null, true);
                        return;
                    default:
                        au0Var.r0(null, true);
                        return;
                }
            }
        });
        g11.setAlpha(0.0f);
        g11.setVisibility(8);
        frameLayout2.addView(g11, y5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        k0 k0Var = new k0(au0Var, context);
        this.f41740c1 = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        k0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(k0Var, y5.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1 r1Var = new r1(context, z10);
        this.f41768t1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        k0Var.addView(r1Var, y5.c(48.0f, -1));
        o1 o1Var = new o1(context);
        this.f41769u1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        o1Var.setAlignment(pg.u0.e(i10).f41266g);
        k0Var.addView(o1Var, y5.c(48.0f, -1));
        i0 i0Var = new i0(au0Var, context);
        this.f41742d1 = i0Var;
        addView(i0Var, y5.c(-1.0f, -1));
        t1 t1Var = new t1(context);
        this.f41770v1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new ai.g(au0Var, 14));
        o1Var.setTypefaceListView(t1Var);
        i0Var.addView(t1Var, y5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(j6.v0(j6.G8, this.Q1));
        j0 j0Var = new j0(au0Var, context);
        this.G1 = j0Var;
        j0Var.setVisibility(8);
        j0Var.setColorPalette(pg.u0.e(i10));
        j0Var.setColorListener(new m(au0Var, 0));
        k0Var.addView(j0Var, y5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        f1 f1Var = new f1(context);
        this.A0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(j6.f0(1090519039, 1, -1));
        k0Var.addView(f1Var, y5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        j1 j1Var = new j1(context);
        this.B0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(j6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new ai.d0(au0Var, context, bitmap2, 29));
        k0Var.addView(j1Var, y5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w1 w1Var = new w1(context);
        this.l1 = w1Var;
        w1Var.setColorSwatch(this.K1);
        w1Var.setRenderView(this.W0);
        w1Var.setValueOverride(this.f41759m1);
        this.K1.f41244c = this.f41759m1.get();
        w1Var.setOnUpdate(new ai1(au0Var, i10, 2));
        addView(w1Var, y5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41744e1 = frameLayout3;
        addView(frameLayout3, y5.c(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.K1, null);
        b((pg.m) pg.m.f41158a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(au0 au0Var, Integer num) {
        au0Var.setNewColor(num.intValue());
        au0Var.w0(false);
    }

    public static void a0(qg.m0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: qg.m0.a0(qg.m0):void");
    }

    public static void b0(m0 m0Var) {
        n2 n2Var;
        g0 g0Var = m0Var.Z0;
        j jVar = m0Var.S0;
        if (jVar != null) {
            PointF A0 = m0Var.A0(jVar);
            j jVar2 = m0Var.S0;
            if (jVar2 instanceof n2) {
                n2 n2Var2 = new n2(m0Var.getContext(), (n2) m0Var.S0, A0);
                n2Var2.setDelegate(m0Var);
                g0Var.addView(n2Var2);
                n2Var = n2Var2;
            } else if (jVar2 instanceof u2) {
                u2 u2Var = new u2(m0Var.getContext(), (u2) m0Var.S0, A0);
                u2Var.setDelegate(m0Var);
                u2Var.setMaxWidth((int) (m0Var.getPaintingSize().f29776a - 20.0f));
                g0Var.addView(u2Var, y5.c(-2.0f, -2));
                n2Var = u2Var;
            } else {
                n2Var = null;
            }
            m0Var.p0(n2Var);
            m0Var.r0(n2Var, true);
        }
        org.telegram.ui.ActionBar.n1 n1Var = m0Var.R1;
        if (n1Var != null && n1Var.isShowing()) {
            m0Var.R1.d(true);
        }
    }

    public static void c0(au0 au0Var, Integer num) {
        pg.u0 u0Var = au0Var.V1;
        u0Var.h(num.intValue(), true);
        u0Var.g();
        au0Var.setNewColor(num.intValue());
        j0 j0Var = au0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f41748g1 == 2) {
            return this.f41769u1;
        }
        return this.f41768t1;
    }

    private int getFrameRotation() {
        int i10 = this.f41763o1;
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

    private vv0 getPaintingSize() {
        int i10;
        vv0 vv0Var = this.R0;
        if (vv0Var != null) {
            return vv0Var;
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
        vv0 vv0Var2 = new vv0(width, height);
        float f7 = i10;
        vv0Var2.f29776a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        vv0Var2.f29777b = floor;
        if (floor > f7) {
            vv0Var2.f29777b = f7;
            vv0Var2.f29776a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = vv0Var2;
        return vv0Var2;
    }

    public void setNewColor(int i10) {
        pg.s1 s1Var = this.K1;
        int i11 = s1Var.f41242a;
        s1Var.f41242a = i10;
        s0(s1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new d5(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.U0 = i10;
        j jVar = this.S0;
        if (jVar instanceof u2) {
            ((u2) jVar).setType(i10);
        }
        pg.u0 e = pg.u0.e(this.P1);
        e.h = i10;
        e.f41262a.edit().putInt("text_type", i10).apply();
        this.f41769u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        x5 x5Var = new x5(this, context);
        this.f41746f1 = x5Var;
        x5Var.setClipToPadding(false);
        this.f41746f1.setOrientation(0);
        this.f41740c1.addView(this.f41746f1, y5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f41765q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f41765q1;
        int i10 = j6.f19152i6;
        eh.a aVar = this.Q1;
        textView2.setBackground(j6.f0(j6.v0(i10, aVar), 7, -1));
        this.f41765q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41765q1.setTextColor(-1);
        this.f41765q1.setTextSize(1, 14.0f);
        this.f41765q1.setGravity(1);
        this.f41765q1.setTypeface(AndroidUtilities.bold());
        this.f41765q1.setSingleLine();
        this.f41765q1.setOnClickListener(new k(this, 0));
        this.f41746f1.addView(this.f41765q1, y5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f41766r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f41766r1.setBackground(j6.f0(j6.v0(i10, aVar), 7, -1));
        this.f41766r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41766r1.setOnClickListener(new k(this, 1));
        this.f41766r1.setTextColor(-1);
        this.f41766r1.setTextSize(1, 14.0f);
        this.f41766r1.setGravity(1);
        this.f41766r1.setTypeface(AndroidUtilities.bold());
        this.f41766r1.setAlpha(0.6f);
        this.f41766r1.setSingleLine();
        this.f41746f1.addView(this.f41766r1, y5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f41767s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f41767s1.setBackground(j6.f0(j6.v0(i10, aVar), 7, -1));
        this.f41767s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41767s1.setTextColor(-1);
        this.f41767s1.setTextSize(1, 14.0f);
        this.f41767s1.setGravity(1);
        this.f41767s1.setTypeface(AndroidUtilities.bold());
        this.f41767s1.setAlpha(0.6f);
        this.f41767s1.setSingleLine();
        this.f41767s1.setOnClickListener(new k(this, 4));
        this.f41746f1.addView(this.f41767s1, y5.l(1.0f, 0, -2));
    }

    public static void u0(u2 u2Var, int i10) {
        int i11;
        u2Var.setAlign(i10);
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
        u2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        u2Var.getEditText().setTextAlignment(i12);
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

    public final void B0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.f41748g1 != i10 && this.f41750h1 != i10) {
            ValueAnimator valueAnimator = this.f41754j1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f41748g1;
            ViewGroup viewGroup3 = this.f41769u1;
            ViewGroup viewGroup4 = this.f41768t1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f41750h1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.P1;
            pg.u0 e = pg.u0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f41270l != z10) {
                e.f41270l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f41262a.getInt("brush", 0), false);
                }
            }
            int c10 = pg.u0.e(i12).c();
            pg.s1 s1Var = this.K1;
            s1Var.f41242a = c10;
            s0(s1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f41754j1 = duration;
            duration.setInterpolator(qr.f27715f);
            this.f41754j1.addUpdateListener(new x4(this, viewGroup, viewGroup2, 4));
            this.f41754j1.addListener(new ci.y5(this, viewGroup, viewGroup2, i10, 2));
            this.f41754j1.start();
        }
    }

    @Override
    public final int[] C(j jVar) {
        return k0(jVar);
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
                        if (!jVar.f41666l0 && jVar.f41664j0 <= 0.0f) {
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
    public final void D() {
        z0(true);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f41751h2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f41758l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f41758l2).commit();
            } else {
                this.f41757k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f41757k2).commit();
            }
        }
        if (this.f41749g2) {
            if (z10) {
                i11 = this.f41758l2;
            } else {
                i11 = this.f41757k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41747f2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f41747f2.setLayoutParams(layoutParams);
                this.f41755j2 = layoutParams.height;
                requestLayout();
                j4 j4Var = ((au0) this).f32142o2.K1;
                if (j4Var != null) {
                    j4Var.a();
                }
                getHeight();
            }
        }
        if (this.f41760m2 == i10 && this.f41762n2 == z10) {
            getHeight();
            return;
        }
        this.f41760m2 = i10;
        this.f41762n2 = z10;
        boolean z13 = this.f41751h2;
        j jVar = this.S0;
        if (jVar instanceof u2) {
            if (((u2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f41751h2 = z12;
        } else {
            this.f41751h2 = false;
        }
        if (this.f41751h2 && this.f41749g2) {
            x0(0);
        }
        if (this.f41755j2 != 0 && !(z11 = this.f41751h2) && z11 != z13 && !this.f41749g2) {
            this.f41755j2 = 0;
            requestLayout();
            j4 j4Var2 = ((au0) this).f32142o2.K1;
            if (j4Var2 != null) {
                j4Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        w0(true);
    }

    @Override
    public final void b(pg.m mVar) {
        boolean z10 = mVar instanceof pg.b;
        w1 w1Var = this.l1;
        if (!z10 && !(mVar instanceof pg.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof pg.l));
        c0 c0Var = this.W0;
        if (c0Var.getCurrentBrush() instanceof pg.l) {
            this.f41756k1 = true;
        }
        c0Var.setBrush(mVar);
        pg.s1 s1Var = this.K1;
        int i10 = s1Var.f41242a;
        s1Var.f41242a = pg.u0.e(this.P1).c();
        s1Var.f41244c = this.f41759m1.get();
        s0(s1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    @Override
    public final boolean d(j jVar) {
        return r0(jVar, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g0 g0Var;
        u2 u2Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (g0Var = this.Z0) != null) {
            for (int i12 = 0; i12 < g0Var.getChildCount(); i12++) {
                View childAt = g0Var.getChildAt(i12);
                if ((childAt instanceof u2) && (str = (u2Var = (u2) childAt).A0) != null) {
                    u2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: qg.m0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        this.O1.setColor(-15132391);
    }

    @Override
    public final void f() {
        setTextType((this.U0 + 1) % 4);
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.p1(9, this, (x1) view)).start();
    }

    @Override
    public final void g(int i10) {
        j jVar = this.S0;
        if (jVar instanceof u2) {
            u0((u2) jVar, i10);
            pg.u0 e = pg.u0.e(this.P1);
            e.f41266g = i10;
            e.f41262a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        vv0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f29776a / 2.0f;
        float f10 = paintingSize.f29777b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float a2 = (float) org.telegram.messenger.q.a(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f29776a;
            f10 -= a2 * paintingSize.f29777b;
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
        return this.f41764p1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        z5[] z5VarArr;
        g0 g0Var = this.Z0;
        int childCount = g0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = g0Var.getChildAt(i10);
            if (childAt instanceof n2) {
                TLRPC.Document sticker = ((n2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f18308id = sticker.f18302id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof u2) {
                CharSequence text = ((u2) childAt).getText();
                if ((text instanceof Spanned) && (z5VarArr = (z5[]) ((Spanned) text).getSpans(0, text.length(), z5.class)) != null) {
                    for (z5 z5Var : z5VarArr) {
                        if (z5Var != null) {
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                document = q5.f(this.P1, z5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f18308id = document.f18302id;
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

    public pg.e1 getRenderView() {
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

    public m11 getThanosEffect() {
        if (!m11.c()) {
            return null;
        }
        if (this.f41737a1 == null) {
            m11 m11Var = new m11(getContext(), new n(this, 0));
            this.f41737a1 = m11Var;
            addView(m11Var);
        }
        return this.f41737a1;
    }

    public final x1 h0(String str, boolean z10) {
        float f7;
        vv0 vv0Var;
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
            vv0Var = new vv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(g0Var.getMeasuredHeight() * 0.5d);
            vv0Var = new vv0(f7 * floor2, floor2);
        }
        vv0 vv0Var2 = vv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = vv0Var2.f29776a;
            vv0Var2.f29776a = vv0Var2.f29777b;
            vv0Var2.f29777b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        x1 x1Var = new x1(context, g02, vv0Var2, str, intValue);
        x1Var.setDelegate(this);
        g0Var.addView(x1Var);
        if (z10) {
            p0(x1Var);
            r0(x1Var, true);
        }
        return x1Var;
    }

    public final qg.z i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: qg.m0.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):qg.z");
    }

    public final u2 j0(boolean z10) {
        ((au0) this).f32142o2.f31198g0.isFocusable();
        vv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        u2 u2Var = new u2(getContext(), A0, (int) (paintingSize.f29776a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.f29776a / 9.0f;
        n nVar = new n(this, 2);
        u2Var.f41935w0 = (int) (0.5f * f7);
        u2Var.f41936x0 = (int) (f7 * 2.0f);
        u2Var.f41937y0 = nVar;
        float f10 = A0.x;
        g0 g0Var = this.Z0;
        if (f10 == g0Var.getMeasuredWidth() / 2.0f) {
            u2Var.setStickyX(2);
        }
        if (A0.y == g0Var.getMeasuredHeight() / 2.0f) {
            u2Var.setStickyY(2);
        }
        u2Var.setDelegate(this);
        u2Var.setMaxWidth((int) (paintingSize.f29776a - 20.0f));
        int i10 = this.P1;
        u2Var.setTypeface(pg.u0.e(i10).f41268j);
        u2Var.setType(pg.u0.e(i10).h);
        g0Var.addView(u2Var, y5.c(-2.0f, -2));
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            u2Var.j(1.0f / cropState.cropScale);
            u2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(u2Var);
            u2Var.q();
            r0(u2Var, false);
            u2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(u2Var.getFocusedView());
            this.T0 = true;
            int i11 = pg.u0.e(i10).f41266g;
            o1 o1Var = this.f41769u1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(pg.u0.e(i10).h);
        }
        return u2Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.f41743d2;
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
        int[] iArr = this.f41745e2;
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

    public final void l0(boolean z10) {
        if (this.f41749g2) {
            x0(0);
        }
        if (z10) {
            kz kzVar = this.f41747f2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f41747f2.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.f41753i2 = true;
                ofFloat.addListener(new a0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f19667w);
                ofFloat.start();
                return;
            }
            m0();
        }
    }

    public final boolean m(MotionEvent motionEvent) {
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
        float measuredHeight = (c0Var.getMeasuredHeight() / 2.0f) + ((float) org.telegram.messenger.q.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void m0() {
        kz kzVar;
        j4 j4Var;
        if (this.f41755j2 > 0 && (j4Var = ((au0) this).f32142o2.K1) != null) {
            j4Var.a();
        }
        if (!this.f41749g2 && (kzVar = this.f41747f2) != null && kzVar.getVisibility() != 8) {
            this.f41747f2.setVisibility(8);
        }
        this.f41755j2 = 0;
    }

    public final void n0(boolean z10) {
        int i10;
        int i11;
        if (this.f41748g1 == 0) {
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
            this.f41740c1.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.f41738b1.setLayerType(i12, null);
        }
    }

    public final boolean o0() {
        if (this.L1) {
            w0(false);
            return true;
        } else if (this.f41749g2) {
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
        if (this.f41747f2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f41747f2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f41747f2.getMeasuredHeight();
            }
            kz kzVar = this.f41747f2;
            kzVar.layout(0, R, kzVar.getMeasuredWidth(), this.f41747f2.getMeasuredHeight() + R);
        }
        if (!this.V0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        c0 c0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - c0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.q.D(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - c0Var.getMeasuredHeight()) / 2, i16);
        c0Var.layout(ceil, additionalTop, c0Var.getMeasuredWidth() + ceil, c0Var.getMeasuredHeight() + additionalTop);
        e0 e0Var = this.X0;
        e0Var.layout(ceil, additionalTop, e0Var.getMeasuredWidth() + ceil, e0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = c0Var.getMeasuredWidth();
        g0 g0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - g0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((c0Var.getMeasuredHeight() - g0Var.getMeasuredHeight()) / 2) + additionalTop;
        g0Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
        m11 m11Var = this.f41737a1;
        if (m11Var != null) {
            m11Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
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
        float f12 = f10 / this.R0.f29776a;
        this.Q0 = f12;
        g0 g0Var = this.Z0;
        g0Var.setScaleX(f12);
        g0Var.setScaleY(this.Q0);
        g0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f29776a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f29777b, 1073741824));
        m11 m11Var = this.f41737a1;
        if (m11Var != null) {
            m11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f29776a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f29777b, 1073741824));
            this.f41737a1.setScaleX(this.Q0);
            this.f41737a1.setScaleY(this.Q0);
        }
        C0();
        this.Y0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.f41740c1, i10, i11);
        measureChild(this.l1, i10, i11);
        measureChild(this.f41744e1, i10, i11);
        measureChild(this.f41742d1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f41755j2), 1073741824));
        FrameLayout frameLayout = this.f41738b1;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.P0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f41749g2 && !this.f41753i2) {
            this.P0 = true;
            m0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        kz kzVar = this.f41747f2;
        if (kzVar != null) {
            measureChild(kzVar, i10, i11);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.F0.b(jVar.getUUID(), new t(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        j jVar2 = this.S0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.S0 = null;
            if (jVar instanceof u2) {
                ValueAnimator valueAnimator = this.f41754j1;
                if (valueAnimator != null && this.f41750h1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            pg.v1 v1Var = this.F0;
            v1Var.f41281b.remove(uuid);
            v1Var.f41282c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(v1Var, 12));
        }
        w1 w1Var = this.l1;
        ka.c cVar = this.f41759m1;
        w1Var.setValueOverride(cVar);
        w1Var.setShowPreview(true);
        float f7 = cVar.get();
        pg.s1 s1Var = this.K1;
        s1Var.f41244c = f7;
        s0(s1Var, null);
    }

    @Override
    public final boolean r() {
        return !this.T0;
    }

    public final boolean r0(j jVar, boolean z10) {
        m0 m0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof u2;
        int i11 = 2;
        if (z12 && (((i10 = this.f41750h1) == -1 && this.f41748g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f41754j1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.L1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            u2 u2Var = (u2) jVar;
            int gravity = u2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            o1 o1Var = this.f41769u1;
            o1Var.setAlignment(i11);
            o1Var.setTypeface(u2Var.getTypeface().f41145a);
            o1Var.e(u2Var.getType(), true);
            this.f41742d1.invalidate();
        }
        j jVar2 = this.S0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.T0) {
                    int[] k02 = k0(jVar2);
                    y0(new t(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof u2) {
                    AndroidUtilities.showKeyboard(((u2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            m0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = m0Var.S0;
            if (jVar3 instanceof u2) {
                u2 u2Var2 = (u2) jVar3;
                t2 t2Var = u2Var2.f41929q0;
                t2Var.clearFocus();
                t2Var.setEnabled(false);
                t2Var.setClickable(false);
                u2Var2.m();
                if (!z12) {
                    m0Var.T0 = false;
                    AndroidUtilities.hideKeyboard(((u2) m0Var.S0).getFocusedView());
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
        if ((jVar4 instanceof u2) && TextUtils.isEmpty(((u2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = m0Var.S0;
        ka.c cVar = m0Var.f41759m1;
        pg.s1 s1Var = m0Var.K1;
        w1 w1Var = m0Var.l1;
        if (jVar5 != null) {
            h0 h0Var = m0Var.Y0;
            jVar5.m0 = h0Var;
            jVar5.l(h0Var, true);
            m0Var.Z0.bringChildToFront(m0Var.S0);
            j jVar6 = m0Var.S0;
            if (jVar6 instanceof u2) {
                u2 u2Var3 = (u2) jVar6;
                u2Var3.f41938z0 = false;
                u2Var3.getSwatch().f41244c = s1Var.f41244c;
                s0(u2Var3.getSwatch(), null);
                w1Var.setValueOverride(new u5(u2Var3, (int) (m0Var.R0.f29776a / 9.0f), 1));
                w1Var.setShowPreview(false);
                return true;
            }
            w1Var.setValueOverride(cVar);
            w1Var.setShowPreview(true);
            s1Var.f41244c = cVar.get();
            s0(s1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = m0Var.f41754j1;
        if (valueAnimator2 != null && m0Var.f41750h1 != 0) {
            valueAnimator2.cancel();
        }
        if (m0Var.L1) {
            w0(false);
        }
        B0(0);
        w1Var.setValueOverride(cVar);
        w1Var.setShowPreview(true);
        s1Var.f41244c = cVar.get();
        s0(s1Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.P0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(pg.s1 s1Var, Integer num) {
        pg.s1 s1Var2 = this.K1;
        if (s1Var2 != s1Var) {
            s1Var2.f41242a = s1Var.f41242a;
            s1Var2.f41243b = s1Var.f41243b;
            s1Var2.f41244c = s1Var.f41244c;
            int i10 = this.P1;
            pg.u0.e(i10).h(s1Var.f41242a, true);
            pg.u0.e(i10).j(s1Var.f41244c);
        }
        int i11 = s1Var.f41242a;
        c0 c0Var = this.W0;
        c0Var.setColor(i11);
        c0Var.setBrushSize(s1Var.f41244c);
        int i12 = s1Var2.f41242a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new ci.x4(this, num, i12, 2));
            duration.start();
        } else {
            k0 k0Var = this.f41740c1;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        }
        j jVar = this.S0;
        if (jVar instanceof u2) {
            ((u2) jVar).setSwatch(new pg.s1(s1Var.f41243b, s1Var.f41244c, s1Var.f41242a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(ch.d dVar) {
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f41741c2 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.W1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.f41748g1 == 0) {
            this.l1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.U1 = runnable;
    }

    @Override
    public final void t() {
        j4 j4Var;
        if (!this.f41751h2 && !this.f41749g2) {
            j0(true);
            return;
        }
        boolean z10 = this.f41749g2;
        if (z10 && (j4Var = ((au0) this).f32142o2.K1) != null) {
            j4Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.S0;
            if (jVar instanceof u2) {
                AndroidUtilities.showKeyboard(((u2) jVar).getEditText());
            }
        }
    }

    public final void t0(float f7) {
        this.C0 = f7;
        this.f41738b1.setTranslationY(-f7);
        this.f41740c1.setTranslationY(f7);
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

    @Override
    public final pg.u0 v() {
        return pg.u0.e(this.P1);
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
            float f23 = ((-this.f41755j2) / 2.0f) + f16;
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
            lVar.f15496i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15490u = lVar;
            if (!this.f41751h2 && !this.f41749g2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.f41740c1.getTranslationY();
            final ViewGroup barView = getBarView();
            this.M1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    m0 m0Var = m0.this;
                    k0 k0Var = m0Var.f41740c1;
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
                    j0Var.z1(f15, z12);
                    m0Var.B0.setProgress(m0Var.N1);
                    m0Var.A0.setProgress(m0Var.N1);
                    m0Var.f41746f1.setTranslationY(AndroidUtilities.dp(32.0f) * m0Var.N1);
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
                    if (view == m0Var.f41769u1) {
                        m0Var.f41742d1.invalidate();
                    }
                }
            });
            this.M1.a(new r(this, z10, 1));
            this.M1.f();
            if (z10) {
                j0 j0Var = this.G1;
                j0Var.setVisibility(0);
                j0Var.setSelectedColorIndex(pg.u0.e(this.P1).d());
            }
        }
    }

    public final void x0(int i10) {
        boolean z10;
        int i11;
        o1 o1Var = this.f41769u1;
        if (i10 == 1) {
            kz kzVar = this.f41747f2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kz kzVar2 = this.f41747f2;
            if (kzVar2 != null && kzVar2.f25892c1 != UserConfig.selectedAccount) {
                removeView(kzVar2);
                this.f41747f2 = null;
            }
            if (this.f41747f2 == null) {
                kz kzVar3 = new kz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
                this.f41747f2 = kzVar3;
                kzVar3.U0 = true;
                kzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f41747f2.setForseMultiwindowLayout(true);
                }
                this.f41747f2.setDelegate(new b0(this));
                addView(this.f41747f2);
            }
            this.f41747f2.setVisibility(0);
            this.f41749g2 = true;
            kz kzVar4 = this.f41747f2;
            if (this.f41757k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f41757k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f41757k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f41758l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f41758l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f41758l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f41758l2;
            } else {
                i11 = this.f41757k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
            layoutParams.height = i11;
            kzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.S0;
                if (jVar instanceof u2) {
                    AndroidUtilities.hideKeyboard(((u2) jVar).getEditText());
                }
            }
            this.f41755j2 = i11;
            requestLayout();
            j4 j4Var = ((au0) this).f32142o2.K1;
            if (j4Var != null) {
                j4Var.a();
            }
            ah emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            getHeight();
            if (!z10 && !this.f41751h2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41755j2, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new a0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        ah emojiButton2 = o1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(yg.e, true);
        }
        kz kzVar5 = this.f41747f2;
        if (kzVar5 != null) {
            this.f41749g2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                kzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f41755j2 = 0;
        }
        j4 j4Var2 = ((au0) this).f32142o2.K1;
        if (j4Var2 != null) {
            j4Var2.a();
        }
        requestLayout();
        getHeight();
    }

    @Override
    public final void y() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void y0(Runnable runnable, m0 m0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.n1 n1Var = this.R1;
        if (n1Var != null && n1Var.isShowing()) {
            this.R1.d(true);
            return;
        }
        if (this.S1 == null) {
            this.T1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.Q1);
            this.S1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.S1.setBackgroundColor(-14145495);
            this.S1.setOnTouchListener(new h5(this, 1));
            this.S1.setDispatchKeyEventListener(new q(this));
            this.S1.setShownFromBottom(true);
        }
        this.S1.d();
        runnable.run();
        if (this.R1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.S1, -2, -2);
            this.R1 = n1Var2;
            n1Var2.f19608b = true;
            n1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.R1.setOutsideTouchable(true);
            this.R1.setClippingEnabled(true);
            this.R1.setInputMethodMode(2);
            this.R1.setSoftInputMode(0);
            this.R1.getContentView().setFocusableInTouchMode(true);
            this.R1.setOnDismissListener(new j5(this, 1));
        }
        this.S1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.R1.setFocusable(true);
        this.R1.showAtLocation(m0Var, i10, i11 - (this.S1.getMeasuredWidth() / 2), i12 - this.S1.getMeasuredHeight());
        org.telegram.ui.ActionBar.n1.i(this.S1);
    }

    @Override
    public final void z(j jVar) {
        int[] k02 = k0(jVar);
        y0(new t(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
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
            lVar.f15496i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15490u = lVar;
            if (z10) {
                t1 t1Var = this.f41770v1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.F1.b(new qa(3, this));
            this.F1.a(new r(this, z10, 0));
            this.F1.f();
        }
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void B() {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h(boolean z10) {
    }

    @Override
    public final void i(boolean z10) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void n(boolean z10) {
    }

    @Override
    public final void w() {
    }
}
