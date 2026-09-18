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
public class xd1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.i40 A0;
    public nd1 A1;
    public AnimatorSet B0;
    public Object B1;
    public u4 C0;
    public Bitmap C1;
    public vc1 D0;
    public boolean D1;
    public final int E;
    public vc1 E0;
    public boolean E1;
    public final int F;
    public ImageView F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public String G1;
    public final boolean H;
    public AnimatorSet H0;
    public int H1;
    public final long I;
    public AnimatorSet I0;
    public wd1 I1;
    public final long J;
    public org.telegram.ui.Components.k81[] J0;
    public long J1;
    public final long K;
    public org.telegram.ui.Components.k81[] K0;
    public boolean K1;
    public final long L;
    public final FrameLayout[] L0;
    public boolean L1;
    public final float M;
    public final TextView[] M0;
    public boolean M1;
    public final String N;
    public final TextView[] N0;
    public org.telegram.ui.Components.yi0 N1;
    public final int O;
    public final FrameLayout[] O0;
    public org.telegram.ui.ActionBar.w0 O1;
    public long P;
    public fc1 P0;
    public ValueAnimator P1;
    public ia0 Q;
    public vd1 Q0;
    public t5 Q1;
    public final org.telegram.ui.ActionBar.r5 R;
    public s4.c0 R0;
    public uc1 R1;
    public final org.telegram.ui.ActionBar.r5 S;
    public org.telegram.ui.Cells.l4 S0;
    public final org.telegram.ui.Components.j20 S1;
    public final org.telegram.ui.ActionBar.r5 T;
    public org.telegram.ui.Cells.j0 T0;
    public boolean T1;
    public final org.telegram.ui.ActionBar.r5 U;
    public ArrayList U0;
    public boolean U1;
    public org.telegram.ui.Components.mq V;
    public final HashMap V0;
    public TL_stories.TL_premium_boostsStatus V1;
    public int W;
    public TLRPC.TL_wallPaper W0;
    public float W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public final Runnable Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public boolean Z;
    public int Z0;
    public float Z1;
    public final xc1 f39536a;
    public ci.s6 f39537a0;
    public int f39538a1;
    public boolean a2;
    public final int f39539b;
    public FrameLayout f39540b0;
    public int f39541b1;
    public int f39542b2;
    public Scroller f39543c;
    public TextView f39544c0;
    public int f39545c1;
    public ValueAnimator f39546c2;
    public final boolean d;
    public TextView f39547d0;
    public int f39548d1;
    public boolean f39549d2;
    public org.telegram.ui.Components.yl e;
    public final org.telegram.ui.ActionBar.i6 f39550e0;
    public int f39551e1;
    public TextView f39552e2;
    public org.telegram.ui.ActionBar.w0 f39553f;
    public final boolean f39554f0;
    public int f39555f1;
    public WeakReference f39556f2;
    public final boolean f39557g0;
    public int f39558g1;
    public BitmapDrawable f39559g2;
    public TextView h;
    public final boolean f39560h0;
    public int f39561h1;
    public nc f39562h2;
    public ArrayList f39563i0;
    public int f39564i1;
    public float f39565i2;
    public z4.g f39566j0;
    public int f39567j1;
    public ValueAnimator f39568j2;
    public ci.n6 f39569k0;
    public int f39570k1;
    public UndoView f39571l0;
    public float l1;
    public FrameLayout m0;
    public float f39572m1;
    public int f39573n;
    public org.telegram.ui.Components.ml0 f39574n0;
    public float f39575n1;
    public pd1 f39576o0;
    public float f39577o1;
    public org.telegram.ui.Components.y10 f39578p0;
    public od1 f39579p1;
    public MessageObject f39580q0;
    public org.telegram.ui.Components.oq f39581q1;
    public Drawable f39582r;
    public boolean f39583r0;
    public AnimatorSet f39584r1;
    public final org.telegram.ui.ActionBar.h6 f39585s;
    public org.telegram.ui.ActionBar.k f39586s0;
    public final PorterDuff.Mode f39587s1;
    public org.telegram.ui.ActionBar.r0 f39588t0;
    public int f39589t1;
    public sc1 f39590u0;
    public org.telegram.ui.Components.o9 f39591u1;
    public boolean v;
    public td1 f39592v0;
    public org.telegram.ui.Components.m81 f39593v1;
    public final int f39594w;
    public final md1[] f39595w0;
    public Bitmap f39596w1;
    public final int f39597x;
    public md1 f39598x0;
    public Bitmap f39599x1;
    public final int f39600y;
    public FrameLayout f39601y0;
    public float f39602y1;
    public FrameLayout f39603z0;
    public nd1 f39604z1;

    public xd1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f39536a = new xc1(this);
        this.d = true;
        this.f39573n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.R = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.S = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.T = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.U = r5Var4;
        this.X = -1;
        this.Y = new kc1(this, 0);
        this.f39595w0 = new md1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f39575n1 = 0.0f;
        this.f39587s1 = PorterDuff.Mode.SRC_IN;
        this.f39602y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.j20(getParentActivity(), new zc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f39539b = 2;
        this.B1 = obj;
        this.C1 = bitmap;
        this.D1 = z10;
        if (obj instanceof fj1) {
            fj1 fj1Var = (fj1) obj;
            this.E1 = fj1Var.f33714j;
            TLRPC.TL_wallPaper tL_wallPaper = fj1Var.f33712g;
            this.W0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = fj1Var.h;
                this.l1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.j6.I.q()) {
                    this.l1 *= -1.0f;
                }
            }
        }
        r5Var.v = true;
        r5Var3.v = true;
        r5Var2.v = true;
        r5Var4.v = true;
    }

    public static void U(xd1 xd1Var) {
        org.telegram.ui.ActionBar.h6 k10;
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.M;
        if (i6Var == null) {
            return;
        }
        int i10 = i6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.h6) i6Var.f18758a0.get(i10);
        } else {
            k10 = i6Var.k(false);
        }
        if (xd1Var.f39585s != null) {
            xd1Var.W0();
            org.telegram.ui.ActionBar.j6.t1(xd1Var.f39550e0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.j6.M != null) {
                org.telegram.ui.ActionBar.j6.O = false;
                org.telegram.ui.ActionBar.j6.P = false;
                org.telegram.ui.ActionBar.j6.M = null;
            }
            org.telegram.ui.ActionBar.j6.t(xd1Var.f39550e0, true, xd1Var.f39554f0);
            ((ActionBarLayout) xd1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) xd1Var.parentLayout).U(false, false);
            File file = new File(xd1Var.f39550e0.f18759b);
            org.telegram.ui.ActionBar.i6 i6Var2 = xd1Var.f39550e0;
            org.telegram.ui.ActionBar.j6.u(file, i6Var2.f18757a, i6Var2.F, false);
            MessagesController.getInstance(xd1Var.f39550e0.E).saveTheme(xd1Var.f39550e0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", xd1Var.f39550e0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) xd1Var.getParentLayout().getFragmentStack().get(Math.max(0, xd1Var.getParentLayout().getFragmentStack().size() - 2));
        xd1Var.finishFragment();
        if (xd1Var.f39539b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, i6Var, k10, Boolean.valueOf(xd1Var.f39560h0));
        }
        org.telegram.ui.ActionBar.j6.F1(o2Var);
    }

    public static void V(xd1 xd1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (xd1Var.getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(23, xd1Var.currentAccount, xd1Var.getParentActivity(), xd1Var, xd1Var.f39536a);
        j0Var.G1(canApplyBoost);
        j0Var.F1(xd1Var.V1, true);
        j0Var.H1(xd1Var.J1);
        if (!xd1Var.U0()) {
            j0Var.Q0 = new kc1(xd1Var, 1);
        }
        xd1Var.showDialog(j0Var);
    }

    public static void W(xd1 xd1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = xd1Var.V0;
        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39585s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            xd1Var.U0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18127id))) {
                            xd1Var.U0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f18127id), tL_wallPaper2);
                        }
                        if (h6Var != null && (str = h6Var.f18732o) != null && str.equals(tL_wallPaper2.slug)) {
                            xd1Var.W0 = tL_wallPaper2;
                            xd1Var.b1(false);
                            xd1Var.j1();
                        } else if (h6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = xd1Var.W0;
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
            if (!z10 && (tL_wallPaper = xd1Var.W0) != null) {
                xd1Var.U0.add(0, tL_wallPaper);
            }
            vd1 vd1Var = xd1Var.Q0;
            if (vd1Var != null) {
                vd1Var.l();
            }
            MessagesStorage.getInstance(xd1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (xd1Var.W0 == null && h6Var != null && !TextUtils.isEmpty(h6Var.f18732o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = h6Var.f18732o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(xd1Var.currentAccount).bindRequestToGuid(xd1Var.getConnectionsManager().sendRequest(getwallpaper, new qc1(xd1Var, 0)), xd1Var.classGuid);
        }
    }

    public static void X(xd1 xd1Var) {
        org.telegram.ui.Components.yl ylVar = xd1Var.e;
        int i10 = 0;
        if (ylVar != null) {
            ylVar.B(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            xd1Var.e.G(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        }
        Drawable drawable = xd1Var.f39582r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18863d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = xd1Var.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (xd1Var.f39579p1 != null) {
            org.telegram.ui.ActionBar.e5 e5Var = xd1Var.parentLayout;
            if (e5Var != null && e5Var.getBottomSheet() != null) {
                xd1Var.parentLayout.getBottomSheet().fixNavigationBar(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18934h5));
                if (xd1Var.f39539b == 2 && xd1Var.J1 != 0) {
                    xd1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                xd1Var.setNavigationBarColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18934h5));
            }
        }
        if (xd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.k81[] k81VarArr = xd1Var.J0;
                if (i11 >= k81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.k81 k81Var = k81VarArr[i11];
                if (k81Var != null) {
                    k81Var.invalidate();
                }
                i11++;
            }
        }
        if (xd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.k81[] k81VarArr2 = xd1Var.K0;
                if (i10 >= k81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.k81 k81Var2 = k81VarArr2[i10];
                if (k81Var2 != null) {
                    k81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = xd1Var.f39552e2;
        if (textView != null) {
            textView.setTextColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        }
        org.telegram.ui.Components.mq mqVar = xd1Var.V;
        if (mqVar != null) {
            mqVar.invalidate();
        }
        org.telegram.ui.Components.y10 y10Var = xd1Var.f39578p0;
        if (y10Var != null) {
            y10Var.g();
        }
    }

    public final void M0() {
        AnimatorSet animatorSet = this.B0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.B0 = animatorSet2;
        if (this.E1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f39598x0, View.SCALE_X, this.f39602y1), ObjectAnimator.ofFloat(this.f39598x0, View.SCALE_Y, this.f39602y1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f39598x0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f39598x0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f39598x0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f39598x0, View.TRANSLATION_Y, 0.0f));
        }
        this.B0.setInterpolator(org.telegram.ui.Components.qr.f27384g);
        this.B0.addListener(new bd1(this, 1));
        this.B0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xd1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i10 = this.f39539b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.j6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.h6 h6Var = this.f39585s;
        if (i10 == 1) {
            if (this.f39557g0) {
                h6Var.f18723c = this.f39594w;
                h6Var.d = this.f39597x;
                h6Var.e = this.f39600y;
                h6Var.f18724f = this.E;
                h6Var.f18725g = this.F;
                h6Var.h = this.G;
                h6Var.f18726i = this.H;
                h6Var.f18727j = this.I;
                h6Var.f18728k = this.J;
                h6Var.f18729l = this.K;
                h6Var.f18730m = this.L;
                h6Var.f18731n = this.O;
                h6Var.f18732o = this.N;
                h6Var.f18733p = this.M;
            }
            org.telegram.ui.ActionBar.j6.t1(this.f39550e0, false, true, false, false, false);
        } else {
            if (h6Var != null) {
                org.telegram.ui.ActionBar.j6.t1(this.f39550e0, false, this.f39560h0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f39560h0) {
                org.telegram.ui.ActionBar.i6 i6Var = this.f39550e0;
                if (i6Var.f18759b != null && org.telegram.ui.ActionBar.j6.H.get(i6Var.m()) == null) {
                    new File(i6Var.f18759b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f39556f2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f39559g2;
        }
        WeakReference weakReference2 = this.f39556f2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f39556f2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f39556f2 = new WeakReference(drawable);
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
            this.f39559g2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f39559g2;
        }
        this.f39559g2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xd1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.J1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        yy0 yy0Var = new yy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m0;
        int i10 = org.telegram.ui.ActionBar.j6.f18863d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayout, 1, null, null, null, yy0Var, i10));
        z4.g gVar = this.f39566j0;
        int i11 = org.telegram.ui.ActionBar.j6.f19140s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f19159t8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39586s0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39586s0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39586s0, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39586s0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39586s0, Integer.MIN_VALUE, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39586s0, 1073741824, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39574n0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39540b0, 1, null, null, null, null, i10));
            TextView textView = this.f39547d0;
            int i14 = org.telegram.ui.ActionBar.j6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39544c0, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.mq mqVar = this.V;
        if (mqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = mqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = mqVar.E;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f18991k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f19009l6));
            }
            org.telegram.ui.ActionBar.l0 l0Var = mqVar.F;
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(l0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.l0 l0Var2 = mqVar.F;
            int i18 = org.telegram.ui.ActionBar.j6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.l6(l0Var2, 32, null, null, null, null, i18));
            if (w0Var != null) {
                org.telegram.ui.Components.w6 w6Var = new org.telegram.ui.Components.w6(mqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, w6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, w6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.j6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.j6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.j6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18950i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.j6.f18968j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.O0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18950i3}, null, org.telegram.ui.ActionBar.j6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.l6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.j6.f18968j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f18950i3}, null, org.telegram.ui.ActionBar.j6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.C0, 0, null, org.telegram.ui.ActionBar.j6.f18968j2, null, null, org.telegram.ui.ActionBar.j6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.N0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.M0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.T0, 0, new Class[]{org.telegram.ui.Components.go0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.T0, 0, new Class[]{org.telegram.ui.Components.go0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.S0, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19025m3, org.telegram.ui.ActionBar.j6.f19098q3}, null, org.telegram.ui.ActionBar.j6.f19123ra));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19045n3, org.telegram.ui.ActionBar.j6.f19116r3}, null, org.telegram.ui.ActionBar.j6.f18869dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f19025m3.f18695y;
            int i23 = org.telegram.ui.ActionBar.j6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.f19098q3.f18695y, null, i23));
            org.telegram.ui.ActionBar.r5 r5Var = this.R;
            org.telegram.ui.ActionBar.r5 r5Var2 = this.T;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.j6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.j6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.j6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.j6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19080p3, org.telegram.ui.ActionBar.j6.f19154t3}, null, org.telegram.ui.ActionBar.j6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f19062o3.f18695y;
            int i24 = org.telegram.ui.ActionBar.j6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.j6.f19135s3.f18695y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18904fc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19261z3}, null, org.telegram.ui.ActionBar.j6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f19144sc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18811ab));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18868db));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18813ad));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18903fb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19053nd));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19143sb));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19071od));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39590u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f18864d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f18934h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f18952i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.l6) arrayList.get(i25)).f19392o = this.f39536a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j3;
        if (this.f39557g0) {
            return false;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f39585s;
        if (i10 == 1 || i10 == 2) {
            long j10 = this.I;
            if (j10 != 0) {
                if (j10 != h6Var.f18727j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i11 = (int) h6Var.f18727j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            }
            long j11 = this.L;
            long j12 = this.K;
            long j13 = this.J;
            if (j13 == 0 && j12 == 0 && j11 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        j3 = h6Var.f18728k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        j3 = h6Var.f18729l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        j3 = h6Var.f18730m;
                    }
                    int i13 = (int) j3;
                    if (i13 == 0 && j3 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = B0;
                    }
                    if (i13 != B0) {
                        return true;
                    }
                }
            } else if (j13 != h6Var.f18728k || j12 != h6Var.f18729l || j11 != h6Var.f18730m) {
                return true;
            }
            if (h6Var.f18731n != this.O) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f39594w != h6Var.d) {
                return true;
            }
            int i14 = this.f39600y;
            if (i14 != 0) {
                if (i14 != h6Var.e) {
                    return true;
                }
            } else {
                int i15 = h6Var.e;
                if (i15 != 0 && i15 != h6Var.f18723c) {
                    return true;
                }
            }
            int i16 = this.E;
            if (i16 != 0) {
                if (i16 != h6Var.f18724f) {
                    return true;
                }
            } else if (h6Var.f18724f != 0) {
                return true;
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != h6Var.f18725g) {
                    return true;
                }
            } else if (h6Var.f18725g != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != h6Var.h) {
                    return true;
                }
            } else if (h6Var.h != 0) {
                return true;
            }
            if (this.H != h6Var.f18726i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && e5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void V0() {
        float f7;
        t5 t5Var = this.Q1;
        if (t5Var != null) {
            t5Var.invalidate();
        }
        FrameLayout frameLayout = this.f39601y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f39601y0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f39603z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f39603z0.getChildAt(i11).invalidate();
            }
        }
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.k81[] k81VarArr = this.J0;
                if (i12 >= k81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.k81 k81Var = k81VarArr[i12];
                if (k81Var != null) {
                    if (this.M1) {
                        f7 = this.f39575n1 * this.f39577o1;
                    } else {
                        f7 = 0.0f;
                    }
                    k81Var.setDimAmount(f7);
                    this.J0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f39574n0 != null) {
            for (int i13 = 0; i13 < this.f39574n0.getChildCount(); i13++) {
                View childAt = this.f39574n0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f39590u0 != null) {
            for (int i14 = 0; i14 < this.f39590u0.getChildCount(); i14++) {
                View childAt2 = this.f39590u0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        nd1 nd1Var = this.f39604z1;
        if (nd1Var != null) {
            nd1Var.invalidate();
        }
        nd1 nd1Var2 = this.A1;
        if (nd1Var2 != null) {
            nd1Var2.invalidate();
        }
        u4 u4Var = this.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f39585s;
        if (h6Var != null && !TextUtils.isEmpty(h6Var.f18732o)) {
            try {
                File d = h6Var.d();
                Drawable background = this.f39598x0.getBackground();
                Bitmap bitmap = this.f39598x0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.cc0) {
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f39567j1, this.f39587s1));
                paint.setAlpha((int) (this.l1 * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(d);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f39573n != i10 && this.f39584r1 == null && (h6Var = this.f39585s) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.j6.Z0() || h6Var.f18727j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.j6.Z0() && (!org.telegram.ui.ActionBar.j6.Z0() || org.telegram.ui.ActionBar.j6.I.f18769i0.d == 0)) {
                    alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new mc1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mc1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new mc1(this, 6));
                }
                showDialog(alertDialog$Builder.f18447a);
                return;
            }
            int i18 = this.f39573n;
            this.f39573n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (h6Var.f18724f != 0) {
                            if (h6Var.h != 0) {
                                i17 = 4;
                            } else if (h6Var.f18725g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.mq mqVar = this.V;
                        T0(3);
                        mqVar.f(2, 4, i17, true);
                        this.V.e(h6Var.h, 3);
                        this.V.e(h6Var.f18725g, 2);
                        this.V.e(h6Var.f18724f, 1);
                        org.telegram.ui.Components.mq mqVar2 = this.V;
                        int i19 = h6Var.e;
                        if (i19 == 0) {
                            i19 = h6Var.f18723c;
                        }
                        mqVar2.e(i19, 0);
                        this.K0[1].b(0, h6Var.e);
                        this.K0[1].b(1, h6Var.f18724f);
                        this.K0[1].b(2, h6Var.f18725g);
                        this.K0[1].b(3, h6Var.h);
                        if (h6Var.f18725g != 0) {
                            if (i18 == 1) {
                                this.f39592v0.o(0);
                            } else {
                                this.f39592v0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f39592v0.u(0);
                        }
                        this.f39590u0.w0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Nd);
                    int i20 = org.telegram.ui.ActionBar.j6.Od;
                    if (org.telegram.ui.ActionBar.j6.c1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.j6.Pd;
                    if (org.telegram.ui.ActionBar.j6.c1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.j6.Qd;
                    if (org.telegram.ui.ActionBar.j6.c1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j3 = h6Var.f18728k;
                    int i23 = (int) j3;
                    if (i23 == 0 && j3 != 0) {
                        i12 = 0;
                    }
                    long j10 = h6Var.f18729l;
                    int i24 = (int) j10;
                    if (i24 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = h6Var.f18730m;
                    int i25 = (int) j11;
                    if (i25 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) h6Var.f18727j;
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
                    org.telegram.ui.Components.mq mqVar3 = this.V;
                    T0(2);
                    mqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.mq mqVar4 = this.V;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    mqVar4.e(i25, 3);
                    org.telegram.ui.Components.mq mqVar5 = this.V;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    mqVar5.e(i13, 2);
                    org.telegram.ui.Components.mq mqVar6 = this.V;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    mqVar6.e(i23, 1);
                    org.telegram.ui.Components.mq mqVar7 = this.V;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    mqVar7.e(themedColor, 0);
                    if (i18 != 1 && h6Var.f18725g != 0) {
                        this.f39592v0.m(0);
                    } else {
                        this.f39592v0.o(0);
                    }
                    this.f39590u0.w0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (h6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.mq mqVar8 = this.V;
                T0(1);
                mqVar8.f(1, 2, i11, false);
                this.V.e(h6Var.f18723c, 0);
                int i27 = h6Var.d;
                if (i27 != 0) {
                    this.V.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && h6Var.f18725g != 0)) {
                    this.f39592v0.u(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.V.setMinBrightness(0.0f);
                this.V.setMaxBrightness(1.0f);
                return;
            }
            if (i18 == 2 && this.L0[1].getVisibility() == 0) {
                f1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f39550e0.q()) {
                    this.V.setMinBrightness(0.2f);
                    return;
                }
                this.V.setMinBrightness(0.05f);
                this.V.setMaxBrightness(0.8f);
                return;
            }
            this.V.setMinBrightness(0.0f);
            this.V.setMaxBrightness(1.0f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i10 >= 0 && i10 < this.U0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.U0.get(i10);
        } else {
            tL_wallPaper = this.Y0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f39546c2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39546c2.cancel();
        }
        md1[] md1VarArr = this.f39595w0;
        md1 md1Var = md1VarArr[0];
        md1 md1Var2 = md1VarArr[1];
        md1VarArr[0] = md1Var2;
        md1VarArr[1] = md1Var;
        this.f39588t0.removeView(md1Var2);
        this.f39588t0.addView(md1VarArr[0], this.f39588t0.indexOfChild(md1VarArr[1]) + 1);
        md1 md1Var3 = md1VarArr[0];
        this.f39598x0 = md1Var3;
        md1Var3.setBackground(md1VarArr[1].getBackground());
        k1();
        md1VarArr[1].setVisibility(0);
        md1VarArr[1].setAlpha(1.0f);
        this.f39598x0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39546c2 = ofFloat;
        ofFloat.addUpdateListener(new dj(2, this));
        this.f39546c2.addListener(new bd1(this, 0));
        this.f39546c2.setInterpolator(org.telegram.ui.Components.qr.f27383f);
        this.f39546c2.setDuration(300L);
        this.f39546c2.start();
        this.f39598x0.getImageReceiver().setCrossfadeDuration(300);
        this.f39598x0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.G1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f39598x0.d();
        this.W0 = tL_wallPaper2;
        this.E1 = this.J0[2].f25594s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.cc0 cc0Var;
        if (i11 == 0) {
            this.Z0 = i10;
        } else if (i11 == 1) {
            this.f39541b1 = i10;
        } else if (i11 == 2) {
            this.f39545c1 = i10;
        } else if (i11 == 3) {
            this.f39548d1 = i10;
        }
        m1(z10);
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.k81[] k81VarArr = this.J0;
                if (i12 >= k81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.k81 k81Var = k81VarArr[i12];
                if (k81Var != null) {
                    k81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f39545c1 != 0) {
            if (this.T0 != null && org.telegram.ui.ActionBar.j6.I.q()) {
                this.T0.setTwoSided(true);
            }
            Drawable background = this.f39598x0.getBackground();
            if (background instanceof org.telegram.ui.Components.cc0) {
                cc0Var = (org.telegram.ui.Components.cc0) background;
            } else {
                cc0Var = new org.telegram.ui.Components.cc0();
                cc0Var.r(this.f39598x0);
                if (this.D1) {
                    cc0Var.m(false);
                }
            }
            cc0Var.n(this.Z0, this.f39541b1, this.f39545c1, this.f39548d1);
            this.f39598x0.setBackground(cc0Var);
            this.f39567j1 = cc0Var.f();
            this.f39570k1 = 754974720;
        } else if (this.f39541b1 != 0) {
            this.f39598x0.setBackground(new GradientDrawable(org.telegram.ui.Components.t9.d(this.f39561h1), new int[]{this.Z0, this.f39541b1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.Z0, this.f39541b1));
            this.f39570k1 = patternColor;
            this.f39567j1 = patternColor;
        } else {
            this.f39598x0.setBackgroundColor(this.Z0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.Z0);
            this.f39570k1 = patternColor2;
            this.f39567j1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.j6.f19015lc;
        boolean c12 = org.telegram.ui.ActionBar.j6.c1(i13);
        xc1 xc1Var = this.f39536a;
        if (c12 && !(this.f39598x0.getBackground() instanceof org.telegram.ui.Components.cc0)) {
            if (org.telegram.ui.ActionBar.j6.s0() instanceof org.telegram.ui.Components.cc0) {
                getThemedColor(i13);
                xc1Var.b(this.f39598x0.getBackground(), this.f39598x0.getBackground(), Float.valueOf(this.l1));
            }
        } else {
            xc1Var.b(this.f39598x0.getBackground(), this.f39598x0.getBackground(), Float.valueOf(this.l1));
        }
        ImageView imageView = this.F0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18959ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.G0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18959ic), PorterDuff.Mode.MULTIPLY));
        }
        md1 md1Var = this.f39598x0;
        if (md1Var != null) {
            md1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f39567j1, this.f39587s1));
            this.f39598x0.getImageReceiver().setAlpha(Math.abs(this.l1));
            this.f39598x0.invalidate();
            if (org.telegram.ui.ActionBar.j6.I.q() && (this.f39598x0.getBackground() instanceof org.telegram.ui.Components.cc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.T0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.l1 < 0.0f) {
                    this.f39598x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.cc0) this.f39598x0.getBackground()).f23009k);
                }
            } else {
                this.f39598x0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.T0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.l1);
            }
        }
        sc1 sc1Var = this.f39590u0;
        if (sc1Var != null) {
            sc1Var.g1();
        }
        FrameLayout frameLayout = this.f39601y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f39601y0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f39603z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f39603z0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.cc0 cc0Var;
        org.telegram.ui.Components.cc0 cc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.h6 h6Var = this.f39585s;
        int i11 = this.f39539b;
        if (i11 == 0 && h6Var == null) {
            this.f39598x0.setBackground(org.telegram.ui.ActionBar.j6.r0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.B1;
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
                    md1 md1Var = this.f39598x0;
                    md1Var.f28304a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    md1Var.d();
                } else if (obj instanceof fj1) {
                    fj1 fj1Var = (fj1) obj;
                    int i12 = fj1Var.f33711f;
                    int i13 = fj1Var.e;
                    int i14 = fj1Var.d;
                    int i15 = fj1Var.f33710c;
                    int i16 = fj1Var.f33709b;
                    this.f39561h1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                    if (tL_wallPaper2 != null) {
                        md1 md1Var2 = this.f39598x0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                        md1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(fj1Var.f33708a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.cc0.g(i16, i15, i14, i13);
                        }
                        this.f39598x0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof gj1) {
                    Bitmap bitmap = this.C1;
                    if (bitmap != null) {
                        this.f39598x0.setImageBitmap(bitmap);
                    } else {
                        gj1 gj1Var = (gj1) obj;
                        File file = gj1Var.e;
                        if (file != null) {
                            this.f39598x0.f(file.getAbsolutePath(), this.G1, null);
                        } else {
                            File file2 = gj1Var.d;
                            if (file2 != null) {
                                this.f39598x0.f(file2.getAbsolutePath(), this.G1, null);
                            } else if ("t".equals(gj1Var.f34006a)) {
                                md1 md1Var3 = this.f39598x0;
                                md1Var3.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(md1Var3, false));
                            } else {
                                int i17 = gj1Var.f34007b;
                                if (i17 != 0) {
                                    this.f39598x0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.H1, true);
                        if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                            photoSize2 = closestPhotoSizeWithSize2;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f39598x0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.G1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        md1 md1Var4 = this.f39598x0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.G1;
                        String str4 = searchImage.thumbUrl;
                        md1Var4.getClass();
                        md1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (h6Var == null) {
                this.f39598x0.setBackground(org.telegram.ui.ActionBar.j6.r0());
            } else {
                org.telegram.ui.Components.o9 o9Var = this.f39591u1;
                if (o9Var != null) {
                    o9Var.dispose();
                    this.f39591u1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int i18 = (int) h6Var.f18727j;
                if (i18 != 0) {
                    B0 = i18;
                }
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                long j3 = h6Var.f18728k;
                int i19 = (int) j3;
                if (i19 == 0 && j3 != 0) {
                    B02 = 0;
                } else if (i19 != 0) {
                    B02 = i19;
                }
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j10 = h6Var.f18729l;
                int i20 = (int) j10;
                if (i20 == 0 && j10 != 0) {
                    B03 = 0;
                } else if (i20 != 0) {
                    B03 = i20;
                }
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                long j11 = h6Var.f18730m;
                int i21 = (int) j11;
                if (i21 == 0 && j11 != 0) {
                    B04 = 0;
                } else if (i21 != 0) {
                    B04 = i21;
                }
                if (!TextUtils.isEmpty(h6Var.f18732o) && !org.telegram.ui.ActionBar.j6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f39598x0.getBackground();
                        if (background instanceof org.telegram.ui.Components.cc0) {
                            cc0Var2 = (org.telegram.ui.Components.cc0) background;
                        } else {
                            org.telegram.ui.Components.cc0 cc0Var3 = new org.telegram.ui.Components.cc0();
                            cc0Var3.r(this.f39598x0);
                            cc0Var2 = cc0Var3;
                            if (this.D1) {
                                cc0Var3.m(false);
                                cc0Var2 = cc0Var3;
                            }
                        }
                        cc0Var2.n(B0, B02, B03, B04);
                        cc0Var = cc0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(org.telegram.ui.Components.t9.d(h6Var.f18731n), new int[]{B0, B02});
                        this.f39591u1 = t9Var.f(k2.c0.m(0.5f, 3), new fd1(this, 0), 100L);
                        cc0Var = t9Var;
                    } else {
                        cc0Var = new ColorDrawable(B0);
                    }
                    this.f39598x0.setBackground(cc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.W0;
                    if (tL_wallPaper4 != null) {
                        md1 md1Var5 = this.f39598x0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.W0;
                        md1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.cc0) {
                            ((org.telegram.ui.Components.cc0) s02).r(this.f39598x0);
                        }
                        this.f39598x0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f39570k1 = patternColor;
                    this.f39567j1 = patternColor;
                } else if (B03 != 0) {
                    this.f39567j1 = org.telegram.ui.Components.cc0.g(B0, B02, B03, B04);
                    this.f39570k1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f39570k1 = patternColor2;
                    this.f39567j1 = patternColor2;
                }
                md1 md1Var6 = this.f39598x0;
                if (md1Var6 != null) {
                    md1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f39567j1, this.f39587s1));
                    this.f39598x0.getImageReceiver().setAlpha(Math.abs(this.l1));
                    this.f39598x0.invalidate();
                    if (org.telegram.ui.ActionBar.j6.I.q() && (this.f39598x0.getBackground() instanceof org.telegram.ui.Components.cc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.l1 < 0.0f) {
                            this.f39598x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.cc0) this.f39598x0.getBackground()).f23009k);
                        }
                    } else {
                        this.f39598x0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.T0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.l1);
                    }
                }
                if (this.J0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.k81[] k81VarArr = this.J0;
                        if (i22 >= k81VarArr.length) {
                            break;
                        }
                        k81VarArr[i22].b(0, B0);
                        this.J0[i22].b(1, B02);
                        this.J0[i22].b(2, B03);
                        this.J0[i22].b(3, B04);
                        i22++;
                    }
                }
                ImageView imageView = this.F0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18959ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.G0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18959ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.D1 = false;
    }

    public final void c1(long j3) {
        boolean z10;
        this.J1 = j3;
        if (j3 != 0 && j3 != getUserConfig().getClientUserId()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.K1 = z10;
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xd1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        xc1 xc1Var;
        float f7;
        if (this.f39598x0 == null) {
            return;
        }
        Bitmap bitmap = this.f39536a.f39527r;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f39598x0.getMeasuredWidth() - (Math.max(this.f39598x0.getMeasuredWidth() / width, this.f39598x0.getMeasuredHeight() / xc1Var.f39527r.getHeight()) * width)) / 2.0f) + this.X1 + 0.0f;
        } else {
            f7 = this.X1 + 0.0f;
        }
        float y3 = w0Var.getY() - ((-this.f39598x0.J) + 0.0f);
        int measuredHeight = this.f39598x0.getMeasuredHeight();
        if (this.M1) {
            f10 = this.f39575n1 * this.f39577o1;
        }
        w0Var.f21566w0 = true;
        w0Var.f21563v0 = measuredHeight;
        w0Var.f21559t0 = y3;
        w0Var.f21561u0 = f7;
        w0Var.S1 = f10;
        w0Var.T1.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        w0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.J1 == ((Long) objArr[2]).longValue()) {
                this.V1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.ml0 ml0Var = this.f39574n0;
            if (ml0Var != null) {
                int childCount = ml0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f39574n0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            sc1 sc1Var = this.f39590u0;
            if (sc1Var != null) {
                sc1Var.g1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f39588t0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.B1;
            if (obj instanceof gj1) {
                gj1 gj1Var = (gj1) obj;
                if (gj1Var.f34006a == null) {
                    gj1Var.f34006a = (String) objArr[0];
                }
            }
        } else {
            long j3 = 0;
            if (i10 == NotificationCenter.wallpapersDidLoad) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.U0.clear();
                HashMap hashMap = this.V0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18127id))) {
                            this.U0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f18127id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.h6 h6Var = this.f39585s;
                        if (h6Var != null && (str = h6Var.f18732o) != null && str.equals(wallPaper.slug)) {
                            this.W0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (h6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
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
                if (!z10 && (tL_wallPaper = this.W0) != null) {
                    this.U0.add(0, tL_wallPaper);
                }
                vd1 vd1Var = this.Q0;
                if (vd1Var != null) {
                    vd1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j3 = MediaDataController.calcHash(j3, wallPaper2.f18273id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j3;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new qc1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.J1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f39588t0 != null && this.K0 != null && this.f39585s.f18725g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.A0 == null) {
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(getParentActivity(), 8);
                    this.A0 = i40Var;
                    i40Var.setShowingDuration(5000L);
                    this.A0.setAlpha(0.0f);
                    this.A0.setVisibility(4);
                    this.A0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.A0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f39569k0.addView(this.A0, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new qb1(1, this, globalMainSettings), 500L);
            }
        }
    }

    public final void f1(int i10, boolean z10, boolean z11) {
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
        if (z10 && i10 == 1 && this.W0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = this.f39539b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f39538a1 = this.Z0;
                    int i18 = this.f39541b1;
                    this.f39551e1 = i18;
                    int i19 = this.f39545c1;
                    this.f39555f1 = i19;
                    int i20 = this.f39548d1;
                    this.f39558g1 = i20;
                    this.f39564i1 = this.O;
                    if (i20 != 0) {
                        i16 = 4;
                    } else if (i19 != 0) {
                        i16 = 3;
                    } else if (i18 != 0) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    this.V.f(0, 4, i16, false);
                    this.V.e(this.f39548d1, 3);
                    this.V.e(this.f39545c1, 2);
                    this.V.e(this.f39541b1, 1);
                    this.V.e(this.Z0, 0);
                }
            } else {
                this.X0 = this.W0;
                this.f39572m1 = this.l1;
                this.Q0.l();
                ArrayList arrayList = this.U0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.W0;
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
                    this.R0.h1(i15, (this.P0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.k81[] k81VarArr = this.J0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            k81VarArr[c10].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.T0;
            if (!j0Var.L) {
                float f19 = this.l1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.l1 = f20;
                    j0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.L0;
        if (z11) {
            this.f39584r1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    sc1 sc1Var = this.f39590u0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(sc1Var, property, f16));
                    org.telegram.ui.Components.k81 k81Var = this.J0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(k81Var, property2, f17));
                    org.telegram.ui.Components.k81 k81Var2 = this.J0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(k81Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                } else if (i17 == 2) {
                    sc1 sc1Var2 = this.f39590u0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.A1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (U0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(sc1Var2, property3, dp + i13));
                    org.telegram.ui.Components.k81 k81Var3 = this.J0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(k81Var3, property4, f15));
                    org.telegram.ui.Components.k81 k81Var4 = this.J0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(k81Var4, property4, f21));
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
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                }
            } else {
                sc1 sc1Var3 = this.f39590u0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(sc1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.k81 k81Var5 = this.J0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(k81Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f39598x0, property6, 1.0f));
            }
            this.f39584r1.playTogether(arrayList2);
            this.f39584r1.addListener(new ed1(this, z10, i12, i10, z12));
            this.f39584r1.setInterpolator(org.telegram.ui.Components.qr.f27384g);
            this.f39584r1.setDuration(200L);
            this.f39584r1.start();
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
                sc1 sc1Var4 = this.f39590u0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                sc1Var4.setTranslationY(f12);
                org.telegram.ui.Components.k81 k81Var6 = this.J0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                k81Var6.setAlpha(f13);
                org.telegram.ui.Components.k81 k81Var7 = this.J0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                k81Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            } else if (i17 == 2) {
                sc1 sc1Var5 = this.f39590u0;
                if (i10 == 0) {
                    f7 = 343.0f;
                } else {
                    f7 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f7);
                if (this.A1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (U0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                sc1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.k81 k81Var8 = this.J0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k81Var8.setAlpha(f10);
                org.telegram.ui.Components.k81 k81Var9 = this.J0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                k81Var9.setAlpha(f11);
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
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            }
        } else {
            this.f39590u0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.J0[0].setAlpha(1.0f);
            this.J0[2].setAlpha(1.0f);
            this.f39598x0.setAlpha(1.0f);
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
        org.telegram.ui.Components.k81[] k81VarArr2 = this.J0;
        if (!z12) {
            c12 = 2;
        }
        k81VarArr2[c12].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f39562h2 != null) {
            return;
        }
        if (U0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.O1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.O1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.O1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        nc ncVar = new nc(this, getParentActivity(), canvas, (this.O1.getMeasuredWidth() / 2.0f) + f7, (this.O1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f39562h2 = ncVar;
        ncVar.setOnTouchListener(new bi.d(2));
        this.f39565i2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39568j2 = ofFloat;
        ofFloat.addUpdateListener(new ci.xb(this, 3));
        this.f39568j2.addListener(new bd1(this, 4));
        this.f39568j2.setDuration(400L);
        this.f39568j2.setInterpolator(org.telegram.ui.Components.kt.e);
        this.f39568j2.start();
        frameLayout.addView(this.f39562h2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new kc1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f39589t1;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f39536a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.L1) {
            return S0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        int i10 = (this.J1 > 0L ? 1 : (this.J1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.f39604z1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.J1));
            if (chat != null) {
                this.f39604z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f39581q1 == null) {
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        this.f39581q1 = oqVar;
                        oqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f39581q1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f39604z1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.V1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.J1 < 0 && !this.T1 && !this.U1 && tL_premium_boostsStatus2 == null) {
                        this.T1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.J1, new pc1(this, 0));
                        return;
                    }
                    return;
                }
                this.f39604z1.c(null, z10);
                return;
            }
            this.f39604z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f39604z1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.F1 && this.f39596w1 == null) {
            Bitmap bitmap = this.C1;
            if (bitmap != null) {
                this.f39599x1 = bitmap;
                this.f39596w1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f39598x0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f39599x1 = imageReceiver.getBitmap();
                    this.f39596w1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.F1) {
            Bitmap bitmap2 = this.f39596w1;
            if (bitmap2 != null) {
                this.f39598x0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f39539b == 2) {
            if (this.a2 && motionEvent != null) {
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
        File httpFilePath;
        String name;
        int i10;
        long j3;
        File file;
        String str;
        float f7;
        FrameLayout frameLayout;
        float f10;
        Object obj = this.W0;
        if (obj == null) {
            obj = this.B1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                    j3 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.H1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j3 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.f39539b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f39598x0.invalidate();
                if (i11 == 2) {
                    if (j3 != 0 && this.J1 == 0) {
                        this.f39586s0.setSubtitle(AndroidUtilities.formatFileSize(j3));
                    } else {
                        this.f39586s0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.J1 == 0) {
                    this.f39586s0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f39598x0.invalidate();
            }
            float f11 = 0.5f;
            if (this.W0 == null && (frameLayout = this.f39601y0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f39544c0.setEnabled(exists);
                TextView textView = this.f39544c0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.C0.setEnabled(exists);
                nd1 nd1Var = this.f39604z1;
                if (nd1Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    nd1Var.setAlpha(f7);
                }
                nd1 nd1Var2 = this.A1;
                if (nd1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    nd1Var2.setAlpha(f11);
                }
            } else {
                this.f39553f.setEnabled(exists);
                org.telegram.ui.ActionBar.w0 w0Var = this.f39553f;
                if (exists) {
                    f11 = 1.0f;
                }
                w0Var.setAlpha(f11);
            }
        }
    }

    public final void k1() {
        this.f39598x0.getImageReceiver().setAlpha(Math.abs(this.l1));
        this.f39598x0.invalidate();
        this.P0.g1();
        if (this.l1 >= 0.0f) {
            this.f39598x0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f39598x0.getImageReceiver().setBlendMode(null);
            }
            if (this.f39598x0.getBackground() instanceof org.telegram.ui.Components.cc0) {
                this.f39598x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.cc0) this.f39598x0.getBackground()).f23009k);
            }
        }
        this.f39536a.b(this.f39598x0.getBackground(), this.f39598x0.getBackground(), Float.valueOf(this.l1));
        V0();
    }

    public final void l1() {
        char c10;
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i10 = this.f39539b;
        if (i10 != 1 && i10 != 2) {
            boolean isEnabled = this.J0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.W0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.J0[0].a(false, true);
            }
            org.telegram.ui.Components.k81 k81Var = this.J0[0];
            if (this.W0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            k81Var.setEnabled(z11);
            if (this.W0 != null) {
                this.J0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.J0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.k81 k81Var2 = this.J0[0];
            Property property = View.ALPHA;
            if (this.W0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(k81Var2, property, f11));
            org.telegram.ui.Components.k81 k81Var3 = this.J0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.W0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(k81Var3, property2, f10));
            org.telegram.ui.Components.k81 k81Var4 = this.J0[1];
            if (this.W0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(k81Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.qr.f27384g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new dd1(this));
            animatorSet.start();
            return;
        }
        if (this.W0 == null && (this.B1 instanceof fj1)) {
            this.J0[2].a(false, true);
        }
        org.telegram.ui.Components.k81[] k81VarArr = this.J0;
        if (this.W0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        k81VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.k81 k81Var5 = this.J0[2];
        Property property3 = View.ALPHA;
        if (this.W0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k81Var5, property3, f7);
        org.telegram.ui.Components.k81 k81Var6 = this.J0[0];
        if (this.W0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(k81Var6, property3, f11));
        animatorSet2.addListener(new cd1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.qr.f27384g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xd1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.P0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j5) {
                ((org.telegram.ui.Cells.j5) childAt).u(true);
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
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && e5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f18934h5));
            if (this.f39539b == 2 && this.J1 != 0) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        j1();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.f39539b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.j6.N = true;
        }
        if (i10 == 0 && this.f39585s == null) {
            this.E1 = org.telegram.ui.ActionBar.j6.f18947i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.G1 = a4.a.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.H1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f39589t1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.U0 == null) {
                this.U0 = new ArrayList();
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
        ci.n6 n6Var = this.f39569k0;
        if (n6Var != null && this.Q != null) {
            n6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
        }
        int i10 = this.f39539b;
        if ((i10 == 2 || i10 == 1) && this.f39579p1 == null) {
            AndroidUtilities.runOnUIThread(new p91(1));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f39596w1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f39596w1 = null;
            }
            this.f39536a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f39585s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.E1) {
            this.f39593v1.c(false);
        }
        org.telegram.ui.ActionBar.j6.f18819b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        pd1 pd1Var = this.f39576o0;
        if (pd1Var != null) {
            pd1Var.l();
        }
        td1 td1Var = this.f39592v0;
        if (td1Var != null) {
            td1Var.l();
        }
        if (this.E1) {
            this.f39593v1.c(true);
        }
        org.telegram.ui.ActionBar.j6.f18819b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f39539b == 2) {
            this.f39536a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39536a.f39522a = f6Var;
    }

    public xd1(org.telegram.ui.ActionBar.i6 i6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f39536a = new xc1(this);
        this.d = true;
        this.f39573n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.R = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.S = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.T = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.U = r5Var4;
        this.X = -1;
        this.Y = new kc1(this, 0);
        this.f39595w0 = new md1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f39575n1 = 0.0f;
        this.f39587s1 = PorterDuff.Mode.SRC_IN;
        this.f39602y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.j20(getParentActivity(), new zc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f39539b = i10;
        this.f39554f0 = z12;
        this.f39550e0 = i6Var;
        this.f39560h0 = z10;
        this.f39557g0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.h6 k10 = i6Var.k(!z11);
            this.f39585s = k10;
            if (k10 != null) {
                this.d = false;
                this.f39594w = k10.f18723c;
                this.f39597x = k10.d;
                this.f39600y = k10.e;
                this.E = k10.f18724f;
                this.F = k10.f18725g;
                this.G = k10.h;
                this.H = k10.f18726i;
                this.I = k10.f18727j;
                this.J = k10.f18728k;
                this.K = k10.f18729l;
                this.L = k10.f18730m;
                this.M = k10.f18733p;
                this.N = k10.f18732o;
                this.O = k10.f18731n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.h6 k11 = i6Var.k(false);
            this.f39585s = k11;
            if (k11 != null) {
                this.W0 = k11.f18736s;
            }
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f39585s;
        if (h6Var != null) {
            this.E1 = h6Var.f18734q;
            if (!TextUtils.isEmpty(h6Var.f18732o)) {
                this.l1 = this.f39585s.f18733p;
            }
            org.telegram.ui.ActionBar.j6.M = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.j6.O = true;
            org.telegram.ui.ActionBar.j6.P = true;
            org.telegram.ui.ActionBar.j6.t(i6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        r5Var.v = true;
        r5Var3.v = true;
        r5Var2.v = true;
        r5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    public xd1(org.telegram.ui.ActionBar.i6 i6Var) {
        this(i6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
