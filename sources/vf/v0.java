package vf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import k7.c6;
import oh.a4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x51;
import qh.d4;
public final class v0 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public int C;
    public boolean D;
    public i61 f49219a;
    public or f49220b;
    public org.telegram.ui.ActionBar.w0 f49221c;
    public boolean d;
    public FrameLayout f49222e;
    public s0 f49223f;
    public FrameLayout h;
    public u0 f49224n;
    public eq f49225r;
    public a4 f49226s;
    public boolean v;
    public TLRPC.TL_businessLocation f49227w;
    public TLRPC.GeoPoint f49228x;
    public String f49229y;

    public v0() {
        super(null);
        this.C = -4;
    }

    public final void U(boolean z4) {
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        if (this.f49221c != null) {
            boolean V = V();
            this.f49221c.setEnabled(V);
            float f14 = 0.0f;
            if (z4) {
                ViewPropertyAnimator animate = this.f49221c.animate();
                if (V) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (V) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (V) {
                    f14 = 1.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.w0 w0Var = this.f49221c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f49221c;
                if (V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w0Var2.setScaleX(f11);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f49221c;
                if (V) {
                    f14 = 1.0f;
                }
                w0Var3.setScaleY(f14);
            }
            i61 i61Var = this.f49219a;
            if (i61Var != null && i61Var.V2 != null) {
                boolean z11 = this.D;
                if (this.f49227w != null && (this.f49228x != null || !TextUtils.isEmpty(this.f49229y))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 != z10) {
                    this.f49219a.V2.N(true);
                }
            }
        }
    }

    public final boolean V() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        TLRPC.GeoPoint geoPoint;
        if (this.f49228x == null && TextUtils.isEmpty(this.f49229y)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f49227w != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 != z10) {
            return true;
        }
        if (this.f49228x == null && TextUtils.isEmpty(this.f49229y)) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f49227w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return true;
        }
        String str2 = this.f49229y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f49228x;
        if (geoPoint2 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f49227w;
        if (tL_businessLocation2 != null && tL_businessLocation2.geo_point != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            return true;
        }
        if (geoPoint2 == null || (tL_businessLocation2 != null && (geoPoint = tL_businessLocation2.geo_point) != null && ((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)))) {
            return false;
        }
        return true;
    }

    public final void W() {
        boolean z4;
        String trim;
        if (this.f49220b.f29840c > 0.0f) {
            return;
        }
        if (this.f49228x == null && TextUtils.isEmpty(this.f49229y)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f49229y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                s0 s0Var = this.f49223f;
                int i10 = -this.C;
                this.C = i10;
                AndroidUtilities.shakeViewSpring(s0Var, i10);
                return;
            }
        }
        this.f49220b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z4) {
            if (this.f49228x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f49228x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f49229y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f49229y;
                if (this.f49228x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f49228x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new r0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        x51 x51Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f49227w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f49228x = tL_businessLocation.geo_point;
            this.f49229y = tL_businessLocation.address;
        } else {
            this.f49228x = null;
            this.f49229y = "";
        }
        s0 s0Var = this.f49223f;
        if (s0Var != null) {
            this.d = true;
            s0Var.setText(this.f49229y);
            s0 s0Var2 = this.f49223f;
            s0Var2.setSelection(s0Var2.getText().length());
            this.d = false;
        }
        Y();
        i61 i61Var = this.f49219a;
        if (i61Var != null && (x51Var = i61Var.V2) != null) {
            x51Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        a4 a4Var;
        int measuredWidth;
        u0 u0Var = this.f49224n;
        if (u0Var != null && (a4Var = this.f49226s) != null) {
            if (this.f49228x != null) {
                u0Var.setAlpha(0.0f);
                this.f49224n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f49226s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f49226s.getMeasuredWidth();
                }
                float f10 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                a4 a4Var2 = this.f49226s;
                TLRPC.GeoPoint geoPoint = this.f49228x;
                a4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), android.support.v4.media.a.l(i10, "_240"), this.f49225r, null);
                return;
            }
            a4Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f49220b = new or(mutate, new tp(k6.w0(null, i10, false)));
        this.f49221c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f49220b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        s0 s0Var = new s0(this, getParentActivity());
        this.f49223f = s0Var;
        s0Var.setTextSize(1, 17.0f);
        this.f49223f.setHintTextColor(k6.w0(null, k6.H6, false));
        s0 s0Var2 = this.f49223f;
        int i11 = k6.G6;
        s0Var2.setTextColor(k6.w0(null, i11, false));
        this.f49223f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f49223f.setMaxLines(5);
        this.f49223f.setSingleLine(false);
        this.f49223f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s0 s0Var3 = this.f49223f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        s0Var3.setGravity(i12 | 48);
        this.f49223f.setInputType(180225);
        this.f49223f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f49223f.setCursorColor(k6.w0(null, i11, false));
        this.f49223f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f49223f.setCursorWidth(1.5f);
        this.f49223f.addTextChangedListener(new eh.c(this, 19));
        this.f49223f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f49222e = frameLayout2;
        frameLayout2.addView(this.f49223f, c6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f49222e;
        int i13 = k6.f21659d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        s0 s0Var4 = this.f49223f;
        if (s0Var4 != null) {
            this.d = true;
            s0Var4.setText(this.f49229y);
            s0 s0Var5 = this.f49223f;
            s0Var5.setSelection(s0Var5.getText().length());
            this.d = false;
        }
        this.f49226s = new a4(this, context, 11);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, k6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f49226s.getImageReceiver());
        eq eqVar = new eq(svgThumb);
        this.f49225r = eqVar;
        eqVar.setCallback(this.f49226s);
        this.f49226s.setBackgroundColor(getThemedColor(i13));
        this.f49224n = new u0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f49226s, c6.c(-1.0f, -1));
        this.h.addView(this.f49224n, c6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        i61 i61Var = new i61(this, new d4(this, 21), new q0(this, 0), null);
        this.f49219a = i61Var;
        i61Var.p1();
        i61 i61Var2 = this.f49219a;
        i61Var2.V2.f32957r = false;
        frameLayout.addView(i61Var2, c6.c(-1.0f, -1));
        this.actionBar.A(this.f49219a, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !V();
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        boolean z10;
        if (this.f49228x == null && TextUtils.isEmpty(this.f49229y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (V() && !z10) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new q0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new q0(this, 2));
                showDialog(alertDialog$Builder.f21166a);
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f49219a.setPadding(0, 0, 0, i13);
        this.f49219a.setClipToPadding(false);
    }
}
