package pf;

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
import g7.e6;
import ih.d4;
import kh.b8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.z41;
import org.telegram.ui.xe1;
public final class w0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public boolean C;
    public i51 f45802a;
    public fr f45803b;
    public org.telegram.ui.ActionBar.w0 f45804c;
    public boolean d;
    public FrameLayout f45805e;
    public t0 f45806f;
    public FrameLayout h;
    public v0 f45807n;
    public up f45808r;
    public d4 f45809s;
    public boolean v;
    public TLRPC.TL_businessLocation f45810w;
    public TLRPC.GeoPoint f45811x;
    public String f45812y;

    public w0() {
        super(null);
        this.B = -4;
    }

    public final void T(boolean z10) {
        float f10;
        float f11;
        boolean z11;
        float f12;
        float f13;
        if (this.f45804c != null) {
            boolean U = U();
            this.f45804c.setEnabled(U);
            float f14 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f45804c.animate();
                if (U) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (U) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (U) {
                    f14 = 1.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.w0 w0Var = this.f45804c;
                if (U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f45804c;
                if (U) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                w0Var2.setScaleX(f11);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f45804c;
                if (U) {
                    f14 = 1.0f;
                }
                w0Var3.setScaleY(f14);
            }
            i51 i51Var = this.f45802a;
            if (i51Var != null && i51Var.U2 != null) {
                boolean z12 = this.C;
                if (this.f45810w != null && (this.f45811x != null || !TextUtils.isEmpty(this.f45812y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f45802a.U2.N(true);
                }
            }
        }
    }

    public final boolean U() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        boolean z14;
        boolean z15;
        TLRPC.GeoPoint geoPoint;
        if (this.f45811x == null && TextUtils.isEmpty(this.f45812y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f45810w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f45811x == null && TextUtils.isEmpty(this.f45812y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f45810w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f45812y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f45811x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f45810w;
        if (tL_businessLocation2 != null && tL_businessLocation2.geo_point != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 != z15) {
            return true;
        }
        if (geoPoint2 == null || (tL_businessLocation2 != null && (geoPoint = tL_businessLocation2.geo_point) != null && ((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)))) {
            return false;
        }
        return true;
    }

    public final void V() {
        boolean z10;
        String trim;
        if (this.f45803b.f28558c > 0.0f) {
            return;
        }
        if (this.f45811x == null && TextUtils.isEmpty(this.f45812y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!U()) {
                finishFragment();
                return;
            }
            String str = this.f45812y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                t0 t0Var = this.f45806f;
                int i9 = -this.B;
                this.B = i9;
                AndroidUtilities.shakeViewSpring(t0Var, i9);
                return;
            }
        }
        this.f45803b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f45811x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f45811x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f45812y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f45812y;
                if (this.f45811x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f45811x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new s0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void W() {
        z41 z41Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f45810w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f45811x = tL_businessLocation.geo_point;
            this.f45812y = tL_businessLocation.address;
        } else {
            this.f45811x = null;
            this.f45812y = "";
        }
        t0 t0Var = this.f45806f;
        if (t0Var != null) {
            this.d = true;
            t0Var.setText(this.f45812y);
            t0 t0Var2 = this.f45806f;
            t0Var2.setSelection(t0Var2.getText().length());
            this.d = false;
        }
        X();
        i51 i51Var = this.f45802a;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
        this.v = true;
    }

    public final void X() {
        d4 d4Var;
        int measuredWidth;
        v0 v0Var = this.f45807n;
        if (v0Var != null && (d4Var = this.f45809s) != null) {
            if (this.f45811x != null) {
                v0Var.setAlpha(0.0f);
                this.f45807n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f45809s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f45809s.getMeasuredWidth();
                }
                float f10 = AndroidUtilities.density;
                int i9 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                d4 d4Var2 = this.f45809s;
                TLRPC.GeoPoint geoPoint = this.f45811x;
                d4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i9, min * 240, 15, min)), ta.b.c(i9, "_240"), this.f45808r, null);
                return;
            }
            d4Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.f45803b = new fr(mutate, new jp(f6.w0(null, i9, false)));
        this.f45804c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f45803b);
        T(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        t0 t0Var = new t0(this, getParentActivity());
        this.f45806f = t0Var;
        t0Var.setTextSize(1, 17.0f);
        this.f45806f.setHintTextColor(f6.w0(null, f6.H6, false));
        t0 t0Var2 = this.f45806f;
        int i10 = f6.G6;
        t0Var2.setTextColor(f6.w0(null, i10, false));
        this.f45806f.setBackgroundDrawable(null);
        int i11 = 5;
        this.f45806f.setMaxLines(5);
        this.f45806f.setSingleLine(false);
        this.f45806f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        t0 t0Var3 = this.f45806f;
        if (!LocaleController.isRTL) {
            i11 = 3;
        }
        t0Var3.setGravity(i11 | 48);
        this.f45806f.setInputType(180225);
        this.f45806f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f45806f.setCursorColor(f6.w0(null, i10, false));
        this.f45806f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f45806f.setCursorWidth(1.5f);
        this.f45806f.addTextChangedListener(new bh.f(this, 18));
        this.f45806f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45805e = frameLayout2;
        frameLayout2.addView(this.f45806f, e6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f45805e;
        int i12 = f6.f23001d6;
        frameLayout3.setBackgroundColor(getThemedColor(i12));
        t0 t0Var4 = this.f45806f;
        if (t0Var4 != null) {
            this.d = true;
            t0Var4.setText(this.f45812y);
            t0 t0Var5 = this.f45806f;
            t0Var5.setSelection(t0Var5.getText().length());
            this.d = false;
        }
        this.f45809s = new d4(this, context, 11);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, f6.Pb, 0.2f);
        svgThumb.setColorKey(i10, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f45809s.getImageReceiver());
        up upVar = new up(svgThumb);
        this.f45808r = upVar;
        upVar.setCallback(this.f45809s);
        this.f45809s.setBackgroundColor(getThemedColor(i12));
        this.f45807n = new v0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f45809s, e6.c(-1.0f, -1));
        this.h.addView(this.f45807n, e6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        X();
        i51 i51Var = new i51(this, new b8(this, 20), new r0(this, 0), null);
        this.f45802a = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.f45802a;
        i51Var2.U2.f35188r = false;
        frameLayout.addView(i51Var2, e6.c(-1.0f, -1));
        this.actionBar.z(this.f45802a, true);
        W();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.userInfoDidLoad) {
            W();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !U();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11;
        if (this.f45811x == null && TextUtils.isEmpty(this.f45812y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (U() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new r0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new r0(this, 2));
                showDialog(alertDialog$Builder.f22702a);
            }
            return false;
        }
        return super.onBackPressed(z10);
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f45802a.setPadding(0, 0, 0, i12);
        this.f45802a.setClipToPadding(false);
    }
}
