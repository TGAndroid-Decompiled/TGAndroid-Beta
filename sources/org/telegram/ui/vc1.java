package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class vc1 extends org.telegram.ui.ActionBar.r2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public FrameLayout A0;
    public lc1 A1;
    public org.telegram.ui.Components.t40 B0;
    public lc1 B1;
    public AnimatorSet C0;
    public Object C1;
    public x4 D0;
    public Bitmap D1;
    public final int E;
    public sb1 E0;
    public boolean E1;
    public final int F;
    public sb1 F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public String H1;
    public final boolean I;
    public AnimatorSet I0;
    public int I1;
    public final long J;
    public AnimatorSet J0;
    public uc1 J1;
    public final long K;
    public org.telegram.ui.Components.w91[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.w91[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.yj0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.w0 P1;
    public long Q;
    public bb1 Q0;
    public ValueAnimator Q1;
    public u90 R;
    public tc1 R0;
    public bi.j5 R1;
    public final org.telegram.ui.ActionBar.g6 S;
    public s4.c0 S0;
    public rb1 S1;
    public final org.telegram.ui.ActionBar.g6 T;
    public org.telegram.ui.Cells.q4 T0;
    public final org.telegram.ui.Components.u20 T1;
    public final org.telegram.ui.ActionBar.g6 U;
    public org.telegram.ui.Cells.i0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.g6 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.yq W;
    public final HashMap W0;
    public TL_stories.TL_premium_boostsStatus W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public final Runnable Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final ub1 f44246a;
    public boolean f44247a0;
    public int f44248a1;
    public float a2;
    public final int f44249b;
    public fi.f6 f44250b0;
    public int f44251b1;
    public boolean f44252b2;
    public Scroller f44253c;
    public FrameLayout f44254c0;
    public int f44255c1;
    public int f44256c2;
    public final boolean d;
    public TextView f44257d0;
    public int f44258d1;
    public ValueAnimator f44259d2;
    public org.telegram.ui.Components.km e;
    public TextView f44260e0;
    public int f44261e1;
    public boolean f44262e2;
    public org.telegram.ui.ActionBar.w0 f44263f;
    public final org.telegram.ui.ActionBar.x6 f44264f0;
    public int f44265f1;
    public TextView f44266f2;
    public final boolean f44267g0;
    public int f44268g1;
    public WeakReference f44269g2;
    public TextView h;
    public final boolean f44270h0;
    public int f44271h1;
    public BitmapDrawable f44272h2;
    public final boolean f44273i0;
    public int f44274i1;
    public mc f44275i2;
    public ArrayList f44276j0;
    public int f44277j1;
    public float f44278j2;
    public a5.m f44279k0;
    public int f44280k1;
    public ValueAnimator f44281k2;
    public bh.p f44282l0;
    public int l1;
    public UndoView m0;
    public float f44283m1;
    public int f44284n;
    public FrameLayout f44285n0;
    public float f44286n1;
    public org.telegram.ui.Components.nm0 f44287o0;
    public float f44288o1;
    public nc1 f44289p0;
    public float f44290p1;
    public org.telegram.ui.Components.j20 f44291q0;
    public mc1 f44292q1;
    public Drawable f44293r;
    public MessageObject f44294r0;
    public org.telegram.ui.Components.zq f44295r1;
    public int f44296s;
    public boolean f44297s0;
    public AnimatorSet f44298s1;
    public org.telegram.ui.ActionBar.k f44299t0;
    public final PorterDuff.Mode f44300t1;
    public org.telegram.ui.ActionBar.q0 f44301u0;
    public int f44302u1;
    public final org.telegram.ui.ActionBar.w6 v;
    public pb1 f44303v0;
    public org.telegram.ui.Components.s9 f44304v1;
    public boolean f44305w;
    public rc1 f44306w0;
    public org.telegram.ui.Components.y91 f44307w1;
    public final int f44308x;
    public final kc1[] f44309x0;
    public Bitmap f44310x1;
    public final int f44311y;
    public kc1 f44312y0;
    public Bitmap f44313y1;
    public FrameLayout f44314z0;
    public float f44315z1;

    public vc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f44246a = new ub1(this);
        this.d = true;
        this.f44284n = 1;
        org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6(this, 0, false);
        this.S = g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(this, 0, true);
        this.T = g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3 = new org.telegram.ui.ActionBar.g6(this, 1, false);
        this.U = g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4 = new org.telegram.ui.ActionBar.g6(this, 1, true);
        this.V = g6Var4;
        this.Y = -1;
        this.Z = new hb1(this, 0);
        this.f44309x0 = new kc1[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f44283m1 = 0.5f;
        this.f44288o1 = 0.0f;
        this.f44300t1 = PorterDuff.Mode.SRC_IN;
        this.f44315z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.u20(getParentActivity(), new wb1(this));
        this.U1 = false;
        this.V1 = false;
        this.f44249b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z10;
        if (obj instanceof di1) {
            di1 di1Var = (di1) obj;
            this.F1 = di1Var.f38628j;
            TLRPC.TL_wallPaper tL_wallPaper = di1Var.f38626g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = di1Var.h;
                this.f44283m1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.y6.I.q()) {
                    this.f44283m1 *= -1.0f;
                }
            }
        }
        g6Var.v = true;
        g6Var3.v = true;
        g6Var2.v = true;
        g6Var4.v = true;
    }

    public static void V(vc1 vc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (vc1Var.getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(23, vc1Var.currentAccount, vc1Var.getParentActivity(), vc1Var, vc1Var.f44246a);
        j0Var.K1(canApplyBoost);
        j0Var.J1(vc1Var.W1, true);
        j0Var.L1(vc1Var.K1);
        if (!vc1Var.V0()) {
            j0Var.Q0 = new hb1(vc1Var, 1);
        }
        vc1Var.showDialog(j0Var);
    }

    public static void W(vc1 vc1Var) {
        org.telegram.ui.ActionBar.w6 k10;
        org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.M;
        if (x6Var == null) {
            return;
        }
        int i10 = x6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.w6) x6Var.f23253a0.get(i10);
        } else {
            k10 = x6Var.k(false);
        }
        if (vc1Var.v != null) {
            vc1Var.X0();
            org.telegram.ui.ActionBar.y6.w1(vc1Var.f44264f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.y6.M != null) {
                org.telegram.ui.ActionBar.y6.O = false;
                org.telegram.ui.ActionBar.y6.P = false;
                org.telegram.ui.ActionBar.y6.M = null;
            }
            org.telegram.ui.ActionBar.y6.t(vc1Var.f44264f0, true, vc1Var.f44267g0);
            ((ActionBarLayout) vc1Var.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) vc1Var.parentLayout).W(false, false);
            File file = new File(vc1Var.f44264f0.f23254b);
            org.telegram.ui.ActionBar.x6 x6Var2 = vc1Var.f44264f0;
            org.telegram.ui.ActionBar.y6.u(file, x6Var2.f23252a, x6Var2.F, false);
            MessagesController.getInstance(vc1Var.f44264f0.E).saveTheme(vc1Var.f44264f0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", vc1Var.f44264f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) vc1Var.getParentLayout().getFragmentStack().get(Math.max(0, vc1Var.getParentLayout().getFragmentStack().size() - 2));
        vc1Var.finishFragment();
        if (vc1Var.f44249b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, x6Var, k10, Boolean.valueOf(vc1Var.f44273i0));
        }
        org.telegram.ui.ActionBar.y6.J1(r2Var);
    }

    public static void X(vc1 vc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = vc1Var.W0;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            vc1Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f22034id))) {
                            vc1Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f22034id), tL_wallPaper2);
                        }
                        if (w6Var != null && (str = w6Var.f23227o) != null && str.equals(tL_wallPaper2.slug)) {
                            vc1Var.X0 = tL_wallPaper2;
                            vc1Var.c1(false);
                            vc1Var.k1();
                        } else if (w6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = vc1Var.X0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = vc1Var.X0) != null) {
                vc1Var.V0.add(0, tL_wallPaper);
            }
            tc1 tc1Var = vc1Var.R0;
            if (tc1Var != null) {
                tc1Var.l();
            }
            MessagesStorage.getInstance(vc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (vc1Var.X0 == null && w6Var != null && !TextUtils.isEmpty(w6Var.f23227o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = w6Var.f23227o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(vc1Var.currentAccount).bindRequestToGuid(vc1Var.getConnectionsManager().sendRequest(getwallpaper, new nb1(vc1Var, 0)), vc1Var.classGuid);
        }
    }

    public final void M0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f44312y0, View.SCALE_X, this.f44315z1), ObjectAnimator.ofFloat(this.f44312y0, View.SCALE_Y, this.f44315z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f44312y0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f44312y0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f44312y0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f44312y0, View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.ds.f27531g);
        this.C0.addListener(new yb1(this, 1));
        this.C0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i10 = this.f44249b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.y6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (i10 == 1) {
            if (this.f44270h0) {
                w6Var.f23218c = this.f44308x;
                w6Var.d = this.f44311y;
                w6Var.e = this.E;
                w6Var.f23219f = this.F;
                w6Var.f23220g = this.G;
                w6Var.h = this.H;
                w6Var.f23221i = this.I;
                w6Var.f23222j = this.J;
                w6Var.f23223k = this.K;
                w6Var.f23224l = this.L;
                w6Var.f23225m = this.M;
                w6Var.f23226n = this.P;
                w6Var.f23227o = this.O;
                w6Var.f23228p = this.N;
            }
            org.telegram.ui.ActionBar.y6.w1(this.f44264f0, false, true, false, false, false);
        } else {
            if (w6Var != null) {
                org.telegram.ui.ActionBar.y6.w1(this.f44264f0, false, this.f44273i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.f44273i0) {
                org.telegram.ui.ActionBar.x6 x6Var = this.f44264f0;
                if (x6Var.f23254b != null && org.telegram.ui.ActionBar.y6.H.get(x6Var.m()) == null) {
                    new File(x6Var.f23254b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f44269g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f44272h2;
        }
        WeakReference weakReference2 = this.f44269g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f44269g2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f44269g2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.f44272h2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f44272h2;
        }
        this.f44272h2 = null;
        return null;
    }

    public final boolean Q0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc1.Q0(boolean):boolean");
    }

    public final void R0() {
        int themedColor;
        org.telegram.ui.Components.km kmVar = this.e;
        int i10 = 0;
        if (kmVar != null) {
            kmVar.H(getThemedColor(org.telegram.ui.ActionBar.y6.G8));
            this.e.O(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false);
        }
        if (this.f44293r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6)) != this.f44296s) {
            this.f44296s = themedColor;
            this.f44293r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        x4 x4Var = this.D0;
        if (x4Var != null) {
            x4Var.invalidate();
        }
        if (this.f44292q1 != null) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var != null && j5Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5));
                if (this.f44249b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5));
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                if (i11 >= w91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var = w91VarArr[i11];
                if (w91Var != null) {
                    w91Var.invalidate();
                }
                i11++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr2 = this.L0;
                if (i10 >= w91VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var2 = w91VarArr2[i10];
                if (w91Var2 != null) {
                    w91Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = this.f44266f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, this.f44246a);
        }
        org.telegram.ui.Components.yq yqVar = this.W;
        if (yqVar != null) {
            yqVar.invalidate();
        }
        org.telegram.ui.Components.j20 j20Var = this.f44291q0;
        if (j20Var != null) {
            j20Var.updateColors();
        }
    }

    public final int S0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.K1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList T0() {
        j6 j6Var = new j6(24, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44279k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23637s8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44299t0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44299t0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.E8));
        org.telegram.ui.Components.yq yqVar = this.W;
        if (yqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = yqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = yqVar.E;
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23485k6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23503l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(yqVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I5));
            if (w0Var != null) {
                org.telegram.ui.Components.b7 b7Var = new org.telegram.ui.Components.b7(yqVar, 2);
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (frameLayoutArr != null) {
            for (int i11 = 0; i11 < frameLayoutArr.length; i11++) {
            }
            for (int i12 = 0; i12 < this.P0.length; i12++) {
            }
            for (int i13 = 0; i13 < this.O0.length; i13++) {
            }
            for (int i14 = 0; i14 < this.N0.length; i14++) {
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.S;
            org.telegram.ui.ActionBar.g6 g6Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44303v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{g6Var, g6Var2}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44303v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{g6Var, g6Var2}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44303v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{g6Var, g6Var2}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44303v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44303v0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23343cb));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((org.telegram.ui.ActionBar.h7) arrayList.get(i15)).f22701n = this.f44246a;
        }
        return arrayList;
    }

    public final boolean U0(int i10) {
        int D0;
        long j10;
        if (this.f44270h0) {
            return false;
        }
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.J;
            if (j11 != 0) {
                if (j11 != w6Var.f23222j) {
                    return true;
                }
            } else {
                int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
                int i11 = (int) w6Var.f23222j;
                if (i11 == 0) {
                    i11 = D02;
                }
                if (i11 != D02) {
                    return true;
                }
            }
            long j12 = this.K;
            int i12 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
            long j13 = this.M;
            long j14 = this.L;
            if (i12 == 0 && j14 == 0 && j13 == 0) {
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 == 0) {
                        D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                        j10 = w6Var.f23223k;
                    } else if (i13 == 1) {
                        D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                        j10 = w6Var.f23224l;
                    } else {
                        D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                        j10 = w6Var.f23225m;
                    }
                    int i14 = (int) j10;
                    if (i14 == 0 && j10 != 0) {
                        i14 = 0;
                    } else if (i14 == 0) {
                        i14 = D0;
                    }
                    if (i14 != D0) {
                        return true;
                    }
                }
            } else if (j12 != w6Var.f23223k || j14 != w6Var.f23224l || j13 != w6Var.f23225m) {
                return true;
            }
            if (w6Var.f23226n != this.P) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f44308x != w6Var.d) {
                return true;
            }
            int i15 = this.E;
            if (i15 != 0) {
                if (i15 != w6Var.e) {
                    return true;
                }
            } else {
                int i16 = w6Var.e;
                if (i16 != 0 && i16 != w6Var.f23218c) {
                    return true;
                }
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != w6Var.f23219f) {
                    return true;
                }
            } else if (w6Var.f23219f != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != w6Var.f23220g) {
                    return true;
                }
            } else if (w6Var.f23220g != 0) {
                return true;
            }
            int i19 = this.H;
            if (i19 != 0) {
                if (i19 != w6Var.h) {
                    return true;
                }
            } else if (w6Var.h != 0) {
                return true;
            }
            if (this.I != w6Var.f23221i) {
                return true;
            }
        }
        return false;
    }

    public boolean V0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && j5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void W0() {
        float f7;
        bi.j5 j5Var = this.R1;
        if (j5Var != null) {
            j5Var.invalidate();
        }
        FrameLayout frameLayout = this.f44314z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f44314z0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.A0.getChildAt(i11).invalidate();
            }
        }
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                if (i12 >= w91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var = w91VarArr[i12];
                if (w91Var != null) {
                    if (this.N1) {
                        f7 = this.f44288o1 * this.f44290p1;
                    } else {
                        f7 = 0.0f;
                    }
                    w91Var.setDimAmount(f7);
                    this.K0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f44287o0 != null) {
            for (int i13 = 0; i13 < this.f44287o0.getChildCount(); i13++) {
                View childAt = this.f44287o0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    e1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f44303v0 != null) {
            for (int i14 = 0; i14 < this.f44303v0.getChildCount(); i14++) {
                View childAt2 = this.f44303v0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    e1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        lc1 lc1Var = this.A1;
        if (lc1Var != null) {
            lc1Var.invalidate();
        }
        lc1 lc1Var2 = this.B1;
        if (lc1Var2 != null) {
            lc1Var2.invalidate();
        }
        x4 x4Var = this.D0;
        if (x4Var != null) {
            x4Var.invalidate();
        }
    }

    public final void X0() {
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (w6Var != null && !TextUtils.isEmpty(w6Var.f23227o)) {
            try {
                File d = w6Var.d();
                Drawable background = this.f44312y0.getBackground();
                Bitmap bitmap = this.f44312y0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.vc0) {
                    FileOutputStream fileOutputStream = new FileOutputStream(d);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                background.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(this.f44280k1, this.f44300t1));
                paint.setAlpha((int) (this.f44283m1 * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(d);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    public final void Y0() {
        Z0(2, true);
    }

    public final void Z0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.w6 w6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f44284n != i10 && this.f44298s1 == null && (w6Var = this.v) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.y6.b1() || w6Var.f23222j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.y6.b1() && (!org.telegram.ui.ActionBar.y6.b1() || org.telegram.ui.ActionBar.y6.I.f23264i0.d == 0)) {
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new jb1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new jb1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new jb1(this, 6));
                }
                showDialog(alertDialog$Builder.f22369a);
                return;
            }
            int i18 = this.f44284n;
            this.f44284n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (w6Var.f23219f != 0) {
                            if (w6Var.h != 0) {
                                i17 = 4;
                            } else if (w6Var.f23220g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.yq yqVar = this.W;
                        U0(3);
                        yqVar.f(2, 4, i17, true);
                        this.W.e(w6Var.h, 3);
                        this.W.e(w6Var.f23220g, 2);
                        this.W.e(w6Var.f23219f, 1);
                        org.telegram.ui.Components.yq yqVar2 = this.W;
                        int i19 = w6Var.e;
                        if (i19 == 0) {
                            i19 = w6Var.f23218c;
                        }
                        yqVar2.e(i19, 0);
                        this.L0[1].b(0, w6Var.e);
                        this.L0[1].b(1, w6Var.f23219f);
                        this.L0[1].b(2, w6Var.f23220g);
                        this.L0[1].b(3, w6Var.h);
                        if (w6Var.f23220g != 0) {
                            if (i18 == 1) {
                                this.f44306w0.o(0);
                            } else {
                                this.f44306w0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f44306w0.u(0);
                        }
                        this.f44303v0.w0(0, AndroidUtilities.dp(60.0f), null);
                        f1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Nd);
                    int i20 = org.telegram.ui.ActionBar.y6.Od;
                    if (org.telegram.ui.ActionBar.y6.e1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.y6.Pd;
                    if (org.telegram.ui.ActionBar.y6.e1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.y6.Qd;
                    if (org.telegram.ui.ActionBar.y6.e1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j10 = w6Var.f23223k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i12 = 0;
                    }
                    long j11 = w6Var.f23224l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i13 = 0;
                    }
                    long j12 = w6Var.f23225m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) w6Var.f23222j;
                    if (i23 == 0 && i12 == 0) {
                        i15 = i24;
                        i16 = 1;
                    } else if (i25 == 0 && i14 == 0) {
                        if (i24 == 0 && i13 == 0) {
                            i15 = i24;
                            i16 = 2;
                        } else {
                            i15 = i24;
                            i16 = 3;
                        }
                    } else {
                        i15 = i24;
                        i16 = 4;
                    }
                    org.telegram.ui.Components.yq yqVar3 = this.W;
                    U0(2);
                    yqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.yq yqVar4 = this.W;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    yqVar4.e(i25, 3);
                    org.telegram.ui.Components.yq yqVar5 = this.W;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    yqVar5.e(i13, 2);
                    org.telegram.ui.Components.yq yqVar6 = this.W;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    yqVar6.e(i23, 1);
                    org.telegram.ui.Components.yq yqVar7 = this.W;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    yqVar7.e(themedColor, 0);
                    if (i18 != 1 && w6Var.f23220g != 0) {
                        this.f44306w0.m(0);
                    } else {
                        this.f44306w0.o(0);
                    }
                    this.f44303v0.w0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (w6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.yq yqVar8 = this.W;
                U0(1);
                yqVar8.f(1, 2, i11, false);
                this.W.e(w6Var.f23218c, 0);
                int i27 = w6Var.d;
                if (i27 != 0) {
                    this.W.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && w6Var.f23220g != 0)) {
                    this.f44306w0.u(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.W.setMinBrightness(0.0f);
                this.W.setMaxBrightness(1.0f);
                return;
            }
            if (i18 == 2 && this.M0[1].getVisibility() == 0) {
                g1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f44264f0.q()) {
                    this.W.setMinBrightness(0.2f);
                    return;
                }
                this.W.setMinBrightness(0.05f);
                this.W.setMaxBrightness(0.8f);
                return;
            }
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
        }
    }

    public final void a1(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i10 >= 0 && i10 < this.V0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.V0.get(i10);
        } else {
            tL_wallPaper = this.Z0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f44259d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f44259d2.cancel();
        }
        kc1[] kc1VarArr = this.f44309x0;
        kc1 kc1Var = kc1VarArr[0];
        kc1 kc1Var2 = kc1VarArr[1];
        kc1VarArr[0] = kc1Var2;
        kc1VarArr[1] = kc1Var;
        this.f44301u0.removeView(kc1Var2);
        this.f44301u0.addView(kc1VarArr[0], this.f44301u0.indexOfChild(kc1VarArr[1]) + 1);
        kc1 kc1Var3 = kc1VarArr[0];
        this.f44312y0 = kc1Var3;
        kc1Var3.setBackground(kc1VarArr[1].getBackground());
        l1();
        kc1VarArr[1].setVisibility(0);
        kc1VarArr[1].setAlpha(1.0f);
        this.f44312y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44259d2 = ofFloat;
        ofFloat.addUpdateListener(new yi(2, this));
        this.f44259d2.addListener(new yb1(this, 0));
        this.f44259d2.setInterpolator(org.telegram.ui.Components.ds.f27530f);
        this.f44259d2.setDuration(300L);
        this.f44259d2.start();
        this.f44312y0.getImageReceiver().setCrossfadeDuration(300);
        this.f44312y0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.H1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f44312y0.d();
        this.X0 = tL_wallPaper2;
        this.F1 = this.K0[2].f34483s;
        k1();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23428h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23546nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23568od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23640sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23548nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23398fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23362db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23304ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23641sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23399fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23381ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23659ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23363dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23619ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
    }

    public final void b1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.vc0 vc0Var;
        if (i11 == 0) {
            this.f44248a1 = i10;
        } else if (i11 == 1) {
            this.f44255c1 = i10;
        } else if (i11 == 2) {
            this.f44258d1 = i10;
        } else if (i11 == 3) {
            this.f44261e1 = i10;
        }
        n1(z10);
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                if (i12 >= w91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.w91 w91Var = w91VarArr[i12];
                if (w91Var != null) {
                    w91Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f44258d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.y6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.f44312y0.getBackground();
            if (background instanceof org.telegram.ui.Components.vc0) {
                vc0Var = (org.telegram.ui.Components.vc0) background;
            } else {
                vc0Var = new org.telegram.ui.Components.vc0();
                vc0Var.q(this.f44312y0);
                if (this.E1) {
                    vc0Var.m(false);
                }
            }
            vc0Var.n(this.f44248a1, this.f44255c1, this.f44258d1, this.f44261e1);
            this.f44312y0.setBackground(vc0Var);
            this.f44280k1 = vc0Var.f();
            this.l1 = 754974720;
        } else if (this.f44255c1 != 0) {
            this.f44312y0.setBackground(new GradientDrawable(org.telegram.ui.Components.x9.d(this.f44274i1), new int[]{this.f44248a1, this.f44255c1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.f44248a1, this.f44255c1));
            this.l1 = patternColor;
            this.f44280k1 = patternColor;
        } else {
            this.f44312y0.setBackgroundColor(this.f44248a1);
            int patternColor2 = AndroidUtilities.getPatternColor(this.f44248a1);
            this.l1 = patternColor2;
            this.f44280k1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.y6.f23509lc;
        boolean e12 = org.telegram.ui.ActionBar.y6.e1(i13);
        ub1 ub1Var = this.f44246a;
        if (e12 && !(this.f44312y0.getBackground() instanceof org.telegram.ui.Components.vc0)) {
            if (org.telegram.ui.ActionBar.y6.t0() instanceof org.telegram.ui.Components.vc0) {
                getThemedColor(i13);
                ub1Var.j(this.f44312y0.getBackground(), this.f44312y0.getBackground(), Float.valueOf(this.f44283m1));
            }
        } else {
            ub1Var.j(this.f44312y0.getBackground(), this.f44312y0.getBackground(), Float.valueOf(this.f44283m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23454ic, ub1Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.f23454ic, ub1Var, PorterDuff.Mode.MULTIPLY);
        }
        kc1 kc1Var = this.f44312y0;
        if (kc1Var != null) {
            kc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f44280k1, this.f44300t1));
            this.f44312y0.getImageReceiver().setAlpha(Math.abs(this.f44283m1));
            this.f44312y0.invalidate();
            if (org.telegram.ui.ActionBar.y6.I.q() && (this.f44312y0.getBackground() instanceof org.telegram.ui.Components.vc0)) {
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setTwoSided(true);
                }
                if (this.f44283m1 < 0.0f) {
                    this.f44312y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.vc0) this.f44312y0.getBackground()).f33688k);
                }
            } else {
                this.f44312y0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                if (i0Var2 != null) {
                    i0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.i0 i0Var3 = this.U0;
            if (i0Var3 != null) {
                i0Var3.setProgress(this.f44283m1);
            }
        }
        pb1 pb1Var = this.f44303v0;
        if (pb1Var != null) {
            pb1Var.g1();
        }
        FrameLayout frameLayout = this.f44314z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f44314z0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.A0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void c1(boolean z10) {
        org.telegram.ui.Components.vc0 vc0Var;
        org.telegram.ui.Components.vc0 vc0Var2;
        int i10;
        int g7;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        int i11 = this.f44249b;
        if (i11 == 0 && w6Var == null) {
            this.f44312y0.setBackground(org.telegram.ui.ActionBar.y6.s0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z10) {
                        photoSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, "b"));
                    }
                    kc1 kc1Var = this.f44312y0;
                    kc1Var.f35004a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.H1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    kc1Var.d();
                } else if (obj instanceof di1) {
                    di1 di1Var = (di1) obj;
                    int i12 = di1Var.f38625f;
                    int i13 = di1Var.e;
                    int i14 = di1Var.d;
                    int i15 = di1Var.f38624c;
                    int i16 = di1Var.f38623b;
                    this.f44274i1 = i12;
                    b1(i16, 0, false);
                    if (i15 != 0) {
                        b1(i15, 1, false);
                    }
                    b1(i14, 2, false);
                    b1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        kc1 kc1Var2 = this.f44312y0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        kc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(di1Var.f38622a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g7 = 1459617792;
                        } else {
                            g7 = org.telegram.ui.Components.vc0.g(i16, i15, i14, i13);
                        }
                        this.f44312y0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g7));
                    }
                } else if (obj instanceof ei1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.f44312y0.setImageBitmap(bitmap);
                    } else {
                        ei1 ei1Var = (ei1) obj;
                        File file = ei1Var.e;
                        if (file != null) {
                            this.f44312y0.g(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = ei1Var.d;
                            if (file2 != null) {
                                this.f44312y0.g(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(ei1Var.f38882a)) {
                                kc1 kc1Var3 = this.f44312y0;
                                kc1Var3.setImageDrawable(org.telegram.ui.ActionBar.y6.Y0(kc1Var3, false));
                            } else {
                                int i17 = ei1Var.f38883b;
                                if (i17 != 0) {
                                    this.f44312y0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.I1, true);
                        if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                            photoSize2 = closestPhotoSizeWithSize2;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f44312y0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.H1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        kc1 kc1Var4 = this.f44312y0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.H1;
                        String str4 = searchImage.thumbUrl;
                        kc1Var4.getClass();
                        kc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (w6Var == null) {
                this.f44312y0.setBackground(org.telegram.ui.ActionBar.y6.s0());
            } else {
                org.telegram.ui.Components.s9 s9Var = this.f44304v1;
                if (s9Var != null) {
                    s9Var.dispose();
                    this.f44304v1 = null;
                }
                int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
                int i18 = (int) w6Var.f23222j;
                if (i18 != 0) {
                    D0 = i18;
                }
                int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                long j10 = w6Var.f23223k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    D02 = 0;
                } else if (i19 != 0) {
                    D02 = i19;
                }
                int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                long j11 = w6Var.f23224l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    D03 = 0;
                } else if (i20 != 0) {
                    D03 = i20;
                }
                int D04 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                long j12 = w6Var.f23225m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    D04 = 0;
                } else if (i21 != 0) {
                    D04 = i21;
                }
                if (!TextUtils.isEmpty(w6Var.f23227o) && !org.telegram.ui.ActionBar.y6.b1()) {
                    if (D03 != 0) {
                        Drawable background = this.f44312y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.vc0) {
                            vc0Var2 = (org.telegram.ui.Components.vc0) background;
                        } else {
                            org.telegram.ui.Components.vc0 vc0Var3 = new org.telegram.ui.Components.vc0();
                            vc0Var3.q(this.f44312y0);
                            vc0Var2 = vc0Var3;
                            if (this.E1) {
                                vc0Var3.m(false);
                                vc0Var2 = vc0Var3;
                            }
                        }
                        vc0Var2.n(D0, D02, D03, D04);
                        vc0Var = vc0Var2;
                    } else if (D02 != 0) {
                        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(org.telegram.ui.Components.x9.d(w6Var.f23226n), new int[]{D0, D02});
                        this.f44304v1 = x9Var.f(jg.s0.e0(0.5f, 3), new cc1(this, 0), 100L);
                        vc0Var = x9Var;
                    } else {
                        vc0Var = new ColorDrawable(D0);
                    }
                    this.f44312y0.setBackground(vc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        kc1 kc1Var5 = this.f44312y0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        kc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.vc0) {
                            ((org.telegram.ui.Components.vc0) t02).q(this.f44312y0);
                        }
                        this.f44312y0.setBackground(t02);
                    }
                }
                if (D02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(D0);
                    this.l1 = patternColor;
                    this.f44280k1 = patternColor;
                } else if (D03 != 0) {
                    this.f44280k1 = org.telegram.ui.Components.vc0.g(D0, D02, D03, D04);
                    this.l1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(D0, D02));
                    this.l1 = patternColor2;
                    this.f44280k1 = patternColor2;
                }
                kc1 kc1Var6 = this.f44312y0;
                if (kc1Var6 != null) {
                    kc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f44280k1, this.f44300t1));
                    this.f44312y0.getImageReceiver().setAlpha(Math.abs(this.f44283m1));
                    this.f44312y0.invalidate();
                    if (org.telegram.ui.ActionBar.y6.I.q() && (this.f44312y0.getBackground() instanceof org.telegram.ui.Components.vc0)) {
                        org.telegram.ui.Cells.i0 i0Var = this.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                        if (this.f44283m1 < 0.0f) {
                            this.f44312y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.vc0) this.f44312y0.getBackground()).f33688k);
                        }
                    } else {
                        this.f44312y0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                        if (i0Var2 != null) {
                            i0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.i0 i0Var3 = this.U0;
                    if (i0Var3 != null) {
                        i0Var3.setProgress(this.f44283m1);
                    }
                }
                if (this.K0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.w91[] w91VarArr = this.K0;
                        if (i22 >= w91VarArr.length) {
                            break;
                        }
                        w91VarArr[i22].b(0, D0);
                        this.K0[i22].b(1, D02);
                        this.K0[i22].b(2, D03);
                        this.K0[i22].b(3, D04);
                        i22++;
                    }
                }
                ImageView imageView = this.G0;
                ub1 ub1Var = this.f44246a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23454ic, ub1Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.f23454ic, ub1Var, PorterDuff.Mode.MULTIPLY);
                }
                W0();
            }
        }
        this.E1 = false;
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc1.createView(android.content.Context):android.view.View");
    }

    public final void d1(long j10) {
        boolean z10;
        this.K1 = j10;
        if (j10 != 0 && j10 != getUserConfig().getClientUserId()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.L1 = z10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                i1(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.nm0 nm0Var = this.f44287o0;
            if (nm0Var != null) {
                int childCount = nm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f44287o0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt).a0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            pb1 pb1Var = this.f44303v0;
            if (pb1Var != null) {
                pb1Var.g1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f44301u0 != null) {
                c1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.C1;
            if (obj instanceof ei1) {
                ei1 ei1Var = (ei1) obj;
                if (ei1Var.f38882a == null) {
                    ei1Var.f38882a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i10 == NotificationCenter.wallpapersDidLoad) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.V0.clear();
                HashMap hashMap = this.W0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f22034id))) {
                            this.V0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f22034id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.w6 w6Var = this.v;
                        if (w6Var != null && (str = w6Var.f23227o) != null && str.equals(wallPaper.slug)) {
                            this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                            c1(false);
                            k1();
                        } else if (w6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                            if (tL_wallPaper2 != null) {
                                String str2 = tL_wallPaper2.slug;
                                if (str2 != null) {
                                    if (!str2.equals(wallPaper.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
                if (!z10 && (tL_wallPaper = this.X0) != null) {
                    this.V0.add(0, tL_wallPaper);
                }
                tc1 tc1Var = this.R0;
                if (tc1Var != null) {
                    tc1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = MediaDataController.calcHash(j10, wallPaper2.f22182id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new nb1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.K1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(org.telegram.ui.Cells.v0 v0Var) {
        ub1 ub1Var;
        float f7;
        if (this.f44312y0 == null) {
            return;
        }
        Bitmap bitmap = this.f44246a.f43976i;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f44312y0.getMeasuredWidth() - (Math.max(this.f44312y0.getMeasuredWidth() / width, this.f44312y0.getMeasuredHeight() / ub1Var.f43976i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f7 = this.Y1 + 0.0f;
        }
        float y3 = v0Var.getY() - ((-this.f44312y0.J) + 0.0f);
        int measuredHeight = this.f44312y0.getMeasuredHeight();
        if (this.N1) {
            f10 = this.f44288o1 * this.f44290p1;
        }
        v0Var.f25566w0 = true;
        v0Var.f25563v0 = measuredHeight;
        v0Var.f25559t0 = y3;
        v0Var.f25561u0 = f7;
        v0Var.f25506b2 = f10;
        v0Var.f25509c2.setColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        v0Var.invalidate();
    }

    public final void f1() {
        if (this.f44301u0 != null && this.L0 != null && this.v.f23220g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.B0 == null) {
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(getParentActivity(), 8);
                    this.B0 = t40Var;
                    t40Var.setShowingDuration(5000L);
                    this.B0.setAlpha(0.0f);
                    this.B0.setVisibility(4);
                    this.B0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.B0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f44282l0.addView(this.B0, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new by0(28, this, globalMainSettings), 500L);
            }
        }
    }

    public final void g1(int i10, boolean z10, boolean z11) {
        boolean z12;
        char c10;
        char c11;
        FrameLayout frameLayout;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        FrameLayout frameLayout2;
        int i13;
        float f15;
        FrameLayout frameLayout3;
        float f16;
        float f17;
        float f18;
        int i14;
        int i15;
        int i16;
        char c12 = 0;
        if (z10 && i10 == 1 && this.X0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = this.f44249b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f44251b1 = this.f44248a1;
                    int i18 = this.f44255c1;
                    this.f44265f1 = i18;
                    int i19 = this.f44258d1;
                    this.f44268g1 = i19;
                    int i20 = this.f44261e1;
                    this.f44271h1 = i20;
                    this.f44277j1 = this.P;
                    if (i20 != 0) {
                        i16 = 4;
                    } else if (i19 != 0) {
                        i16 = 3;
                    } else if (i18 != 0) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    this.W.f(0, 4, i16, false);
                    this.W.e(this.f44261e1, 3);
                    this.W.e(this.f44258d1, 2);
                    this.W.e(this.f44255c1, 1);
                    this.W.e(this.f44248a1, 0);
                }
            } else {
                this.Y0 = this.X0;
                this.f44286n1 = this.f44283m1;
                this.R0.l();
                ArrayList arrayList = this.V0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                    if (tL_wallPaper == null) {
                        i15 = 0;
                    } else {
                        int indexOf = arrayList.indexOf(tL_wallPaper);
                        if (i17 == 2) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        i15 = indexOf + i14;
                    }
                    this.S0.h1(i15, (this.Q0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.w91[] w91VarArr = this.K0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            w91VarArr[c10].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.i0 i0Var = this.U0;
            if (!i0Var.M) {
                float f19 = this.f44283m1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.f44283m1 = f20;
                    i0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.M0;
        if (z11) {
            this.f44298s1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    pb1 pb1Var = this.f44303v0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(pb1Var, property, f16));
                    org.telegram.ui.Components.w91 w91Var = this.K0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w91Var, property2, f17));
                    org.telegram.ui.Components.w91 w91Var2 = this.K0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w91Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                } else if (i17 == 2) {
                    pb1 pb1Var2 = this.f44303v0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.B1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (V0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(pb1Var2, property3, dp + i13));
                    org.telegram.ui.Components.w91 w91Var3 = this.K0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w91Var3, property4, f15));
                    org.telegram.ui.Components.w91 w91Var4 = this.K0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(w91Var4, property4, f21));
                    if (frameLayoutArr[i12].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property4, 0.0f, 1.0f));
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], View.ALPHA, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                }
            } else {
                pb1 pb1Var3 = this.f44303v0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(pb1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.w91 w91Var5 = this.K0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(w91Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f44312y0, property6, 1.0f));
            }
            this.f44298s1.playTogether(arrayList2);
            this.f44298s1.addListener(new bc1(this, z10, i12, i10, z12));
            this.f44298s1.setInterpolator(org.telegram.ui.Components.ds.f27531g);
            this.f44298s1.setDuration(200L);
            this.f44298s1.start();
            return;
        }
        if (i10 == 0) {
            c11 = 1;
        } else {
            c11 = 0;
        }
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i17 == 1) {
                pb1 pb1Var4 = this.f44303v0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                pb1Var4.setTranslationY(f12);
                org.telegram.ui.Components.w91 w91Var6 = this.K0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                w91Var6.setAlpha(f13);
                org.telegram.ui.Components.w91 w91Var7 = this.K0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                w91Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            } else if (i17 == 2) {
                pb1 pb1Var5 = this.f44303v0;
                if (i10 == 0) {
                    f7 = 343.0f;
                } else {
                    f7 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f7);
                if (this.B1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (V0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                pb1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.w91 w91Var8 = this.K0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w91Var8.setAlpha(f10);
                org.telegram.ui.Components.w91 w91Var9 = this.K0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                w91Var9.setAlpha(f11);
                if (frameLayoutArr[c11].getVisibility() == 0) {
                    frameLayoutArr[c11].setAlpha(0.0f);
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[i10].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i10].setTranslationY(0.0f);
                }
            } else {
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            }
        } else {
            this.f44303v0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.K0[0].setAlpha(1.0f);
            this.K0[2].setAlpha(1.0f);
            this.f44312y0.setAlpha(1.0f);
        }
        if (z10 && frameLayoutArr[c11].getVisibility() == 0) {
            frameLayoutArr[c11].setAlpha(1.0f);
            frameLayoutArr[c11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        if (i17 != 1 && i17 != 2) {
            if (i10 == 1) {
                frameLayoutArr[c11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.w91[] w91VarArr2 = this.K0;
        if (!z12) {
            c12 = 2;
        }
        w91VarArr2[c12].setVisibility(4);
    }

    @Override
    public final int getObserverTag() {
        return this.f44302u1;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.f44246a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.M1) {
            return T0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1() {
        Window window;
        if (this.f44275i2 != null) {
            return;
        }
        if (V0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.P1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.P1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.P1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        mc mcVar = new mc(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f7, (this.P1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f44275i2 = mcVar;
        mcVar.setOnTouchListener(new ei.d(2));
        this.f44278j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44281k2 = ofFloat;
        ofFloat.addUpdateListener(new fi.bb(this, 3));
        this.f44281k2.addListener(new yb1(this, 4));
        this.f44281k2.setDuration(400L);
        this.f44281k2.setInterpolator(org.telegram.ui.Components.ut.e);
        this.f44281k2.start();
        frameLayout.addView(this.f44275i2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new hb1(this, 2));
    }

    public final void i1(boolean z10) {
        int i10 = (this.K1 > 0L ? 1 : (this.K1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K1));
            if (chat != null) {
                this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < S0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f44295r1 == null) {
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_switch_lock, 0);
                        this.f44295r1 = zqVar;
                        zqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f44295r1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", S0(), new Object[0]));
                    this.A1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.K1 < 0 && !this.U1 && !this.V1 && tL_premium_boostsStatus2 == null) {
                        this.U1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.K1, new kb1(this, 1));
                        return;
                    }
                    return;
                }
                this.A1.c(null, z10);
                return;
            }
            this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f44249b == 2) {
            if (this.f44252b2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        if (this.G1 && this.f44310x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.f44313y1 = bitmap;
                this.f44310x1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f44312y0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f44313y1 = imageReceiver.getBitmap();
                    this.f44310x1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.G1) {
            Bitmap bitmap2 = this.f44310x1;
            if (bitmap2 != null) {
                this.f44312y0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        c1(false);
    }

    public final void k1() {
        File httpFilePath;
        String name;
        int i10;
        long j10;
        File file;
        String str;
        float f7;
        FrameLayout frameLayout;
        float f10;
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                    j10 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.I1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j10 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.f44249b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f44312y0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.K1 == 0) {
                        this.f44299t0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    } else {
                        this.f44299t0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.K1 == 0) {
                    this.f44299t0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f44312y0.invalidate();
            }
            float f11 = 0.5f;
            if (this.X0 == null && (frameLayout = this.f44314z0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f44257d0.setEnabled(exists);
                TextView textView = this.f44257d0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.D0.setEnabled(exists);
                lc1 lc1Var = this.A1;
                if (lc1Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    lc1Var.setAlpha(f7);
                }
                lc1 lc1Var2 = this.B1;
                if (lc1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    lc1Var2.setAlpha(f11);
                }
            } else {
                this.f44263f.setEnabled(exists);
                org.telegram.ui.ActionBar.w0 w0Var = this.f44263f;
                if (exists) {
                    f11 = 1.0f;
                }
                w0Var.setAlpha(f11);
            }
        }
    }

    public final void l1() {
        this.f44312y0.getImageReceiver().setAlpha(Math.abs(this.f44283m1));
        this.f44312y0.invalidate();
        this.Q0.g1();
        if (this.f44283m1 >= 0.0f) {
            this.f44312y0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f44312y0.getImageReceiver().setBlendMode(null);
            }
            if (this.f44312y0.getBackground() instanceof org.telegram.ui.Components.vc0) {
                this.f44312y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.vc0) this.f44312y0.getBackground()).f33688k);
            }
        }
        this.f44246a.j(this.f44312y0.getBackground(), this.f44312y0.getBackground(), Float.valueOf(this.f44283m1));
        W0();
    }

    public final void m1() {
        char c10;
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i10 = this.f44249b;
        if (i10 != 1 && i10 != 2) {
            boolean isEnabled = this.K0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.X0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.K0[0].a(false, true);
            }
            org.telegram.ui.Components.w91 w91Var = this.K0[0];
            if (this.X0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            w91Var.setEnabled(z11);
            if (this.X0 != null) {
                this.K0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.K0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.w91 w91Var2 = this.K0[0];
            Property property = View.ALPHA;
            if (this.X0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(w91Var2, property, f11));
            org.telegram.ui.Components.w91 w91Var3 = this.K0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.X0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(w91Var3, property2, f10));
            org.telegram.ui.Components.w91 w91Var4 = this.K0[1];
            if (this.X0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(w91Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.ds.f27531g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ac1(this));
            animatorSet.start();
            return;
        }
        if (this.X0 == null && (this.C1 instanceof di1)) {
            this.K0[2].a(false, true);
        }
        org.telegram.ui.Components.w91[] w91VarArr = this.K0;
        if (this.X0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        w91VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.w91 w91Var5 = this.K0[2];
        Property property3 = View.ALPHA;
        if (this.X0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w91Var5, property3, f7);
        org.telegram.ui.Components.w91 w91Var6 = this.K0[0];
        if (this.X0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(w91Var6, property3, f11));
        animatorSet2.addListener(new zb1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.ds.f27531g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void n1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc1.n1(boolean):void");
    }

    public final void o1() {
        int childCount = this.Q0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.o5) {
                ((org.telegram.ui.Cells.o5) childAt).u(true);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!Q0(z10)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && j5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5));
            if (this.f44249b == 2 && this.K1 != 0) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        k1();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.f44249b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.y6.N = true;
        }
        if (i10 == 0 && this.v == null) {
            this.F1 = org.telegram.ui.ActionBar.y6.f23443i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.H1 = a1.g.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.I1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f44302u1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        bh.p pVar = this.f44282l0;
        if (pVar != null && this.R != null) {
            pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i10 = this.f44249b;
        if ((i10 == 2 || i10 == 1) && this.f44292q1 == null) {
            AndroidUtilities.runOnUIThread(new w90(9));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f44310x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f44310x1 = null;
            }
            this.f44246a.j(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.v != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.f44307w1.c(false);
        }
        org.telegram.ui.ActionBar.y6.f23311b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        nc1 nc1Var = this.f44289p0;
        if (nc1Var != null) {
            nc1Var.l();
        }
        rc1 rc1Var = this.f44306w0;
        if (rc1Var != null) {
            rc1Var.l();
        }
        if (this.F1) {
            this.f44307w1.c(true);
        }
        org.telegram.ui.ActionBar.y6.f23311b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        k1();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            R0();
            try {
                a5.m mVar = this.f44279k0;
                if (mVar != null) {
                    AndroidUtilities.setViewPagerEdgeEffectColor(mVar, getThemedColor(org.telegram.ui.ActionBar.y6.f23637s8));
                }
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.y6.Vi));
                    this.U0.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f44249b == 2) {
            this.f44246a.j(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.f44246a.f43971a = u6Var;
    }

    public vc1(org.telegram.ui.ActionBar.x6 x6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f44246a = new ub1(this);
        this.d = true;
        this.f44284n = 1;
        org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6(this, 0, false);
        this.S = g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(this, 0, true);
        this.T = g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3 = new org.telegram.ui.ActionBar.g6(this, 1, false);
        this.U = g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4 = new org.telegram.ui.ActionBar.g6(this, 1, true);
        this.V = g6Var4;
        this.Y = -1;
        this.Z = new hb1(this, 0);
        this.f44309x0 = new kc1[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f44283m1 = 0.5f;
        this.f44288o1 = 0.0f;
        this.f44300t1 = PorterDuff.Mode.SRC_IN;
        this.f44315z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.u20(getParentActivity(), new wb1(this));
        this.U1 = false;
        this.V1 = false;
        this.f44249b = i10;
        this.f44267g0 = z12;
        this.f44264f0 = x6Var;
        this.f44273i0 = z10;
        this.f44270h0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.w6 k10 = x6Var.k(!z11);
            this.v = k10;
            if (k10 != null) {
                this.d = false;
                this.f44308x = k10.f23218c;
                this.f44311y = k10.d;
                this.E = k10.e;
                this.F = k10.f23219f;
                this.G = k10.f23220g;
                this.H = k10.h;
                this.I = k10.f23221i;
                this.J = k10.f23222j;
                this.K = k10.f23223k;
                this.L = k10.f23224l;
                this.M = k10.f23225m;
                this.N = k10.f23228p;
                this.O = k10.f23227o;
                this.P = k10.f23226n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.w6 k11 = x6Var.k(false);
            this.v = k11;
            if (k11 != null) {
                this.X0 = k11.f23231s;
            }
        }
        org.telegram.ui.ActionBar.w6 w6Var = this.v;
        if (w6Var != null) {
            this.F1 = w6Var.f23229q;
            if (!TextUtils.isEmpty(w6Var.f23227o)) {
                this.f44283m1 = this.v.f23228p;
            }
            org.telegram.ui.ActionBar.y6.M = org.telegram.ui.ActionBar.y6.C0();
            org.telegram.ui.ActionBar.y6.O = true;
            org.telegram.ui.ActionBar.y6.P = true;
            org.telegram.ui.ActionBar.y6.t(x6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        g6Var.v = true;
        g6Var3.v = true;
        g6Var2.v = true;
        g6Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public vc1(org.telegram.ui.ActionBar.x6 x6Var) {
        this(x6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
