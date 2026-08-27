package qf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import jh.z3;
import lh.a8;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.sp;
import org.telegram.ui.ed1;

public final class w0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public boolean C;

    public k51 f46470a;

    public dr f46471b;

    public org.telegram.ui.ActionBar.v0 f46472c;
    public boolean d;

    public FrameLayout f46473e;

    public t0 f46474f;
    public FrameLayout h;

    public v0 f46475n;

    public sp f46476r;

    public z3 f46477s;
    public boolean v;

    public TLRPC.TL_businessLocation f46478w;

    public TLRPC.GeoPoint f46479x;

    public String f46480y;

    public w0() {
        super(null);
        this.B = -4;
    }

    public final void U(boolean z10) {
        if (this.f46472c == null) {
            return;
        }
        boolean zV = V();
        this.f46472c.setEnabled(zV);
        if (z10) {
            this.f46472c.animate().alpha(zV ? 1.0f : 0.0f).scaleX(zV ? 1.0f : 0.0f).scaleY(zV ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.f46472c.setAlpha(zV ? 1.0f : 0.0f);
            this.f46472c.setScaleX(zV ? 1.0f : 0.0f);
            this.f46472c.setScaleY(zV ? 1.0f : 0.0f);
        }
        k51 k51Var = this.f46470a;
        if (k51Var == null || k51Var.U2 == null) {
            return;
        }
        if (this.C != ((this.f46478w == null || (this.f46479x == null && TextUtils.isEmpty(this.f46480y))) ? false : true)) {
            this.f46470a.U2.N(true);
        }
    }

    public final boolean V() {
        TLRPC.GeoPoint geoPoint;
        if (((this.f46479x == null && TextUtils.isEmpty(this.f46480y)) ? false : true) != (this.f46478w != null)) {
            return true;
        }
        boolean z10 = (this.f46479x == null && TextUtils.isEmpty(this.f46480y)) ? false : true;
        TLRPC.TL_businessLocation tL_businessLocation = this.f46478w;
        if (z10 != ((tL_businessLocation == null || (tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) ? false : true)) {
            return true;
        }
        if (!TextUtils.equals(this.f46480y, tL_businessLocation != null ? tL_businessLocation.address : "")) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f46479x;
        boolean z11 = geoPoint2 != null;
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f46478w;
        if (z11 != ((tL_businessLocation2 == null || tL_businessLocation2.geo_point == null) ? false : true)) {
            return true;
        }
        return geoPoint2 != null && (tL_businessLocation2 == null || (geoPoint = tL_businessLocation2.geo_point) == null || !((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)));
    }

    public final void W() {
        if (this.f46471b.f27834c > 0.0f) {
            return;
        }
        boolean z10 = this.f46479x == null && TextUtils.isEmpty(this.f46480y);
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f46480y;
            String strTrim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(strTrim) || strTrim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                t0 t0Var = this.f46474f;
                int i10 = -this.B;
                this.B = i10;
                AndroidUtilities.shakeViewSpring(t0Var, i10);
                return;
            }
        }
        this.f46471b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f46479x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f46479x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f46480y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f46480y;
                if (this.f46479x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f46479x;
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

    public final void X() {
        b51 b51Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f46478w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f46479x = tL_businessLocation.geo_point;
            this.f46480y = tL_businessLocation.address;
        } else {
            this.f46479x = null;
            this.f46480y = "";
        }
        t0 t0Var = this.f46474f;
        if (t0Var != null) {
            this.d = true;
            t0Var.setText(this.f46480y);
            t0 t0Var2 = this.f46474f;
            t0Var2.setSelection(t0Var2.getText().length());
            this.d = false;
        }
        Y();
        k51 k51Var = this.f46470a;
        if (k51Var != null && (b51Var = k51Var.U2) != null) {
            b51Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        z3 z3Var;
        v0 v0Var = this.f46475n;
        if (v0Var == null || (z3Var = this.f46477s) == null) {
            return;
        }
        if (this.f46479x == null) {
            z3Var.setImageBitmap(null);
            return;
        }
        v0Var.setAlpha(0.0f);
        this.f46475n.setTranslationY(-AndroidUtilities.dp(12.0f));
        int measuredWidth = this.f46477s.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : this.f46477s.getMeasuredWidth();
        float f10 = AndroidUtilities.density;
        int i10 = (int) (measuredWidth / f10);
        int iMin = Math.min(2, (int) Math.ceil(f10));
        z3 z3Var2 = this.f46477s;
        TLRPC.GeoPoint geoPoint = this.f46479x;
        z3Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, iMin * i10, iMin * 240, 15, iMin)), s3.c.d(i10, "_240"), this.f46476r, null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(10, this));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23375v8;
        int i11 = 0;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f46471b = new dr(drawableMutate, new hp(g6.w0(null, i10, false)));
        this.f46472c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f46471b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        t0 t0Var = new t0(this, getParentActivity());
        this.f46474f = t0Var;
        t0Var.setTextSize(1, 17.0f);
        this.f46474f.setHintTextColor(g6.w0(null, g6.H6, false));
        t0 t0Var2 = this.f46474f;
        int i12 = g6.G6;
        t0Var2.setTextColor(g6.w0(null, i12, false));
        this.f46474f.setBackgroundDrawable(null);
        this.f46474f.setMaxLines(5);
        this.f46474f.setSingleLine(false);
        this.f46474f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        this.f46474f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f46474f.setInputType(180225);
        this.f46474f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f46474f.setCursorColor(g6.w0(null, i12, false));
        this.f46474f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f46474f.setCursorWidth(1.5f);
        this.f46474f.addTextChangedListener(new ch.e(this, 18));
        this.f46474f.setFilters(new InputFilter[]{new u0()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46473e = frameLayout2;
        frameLayout2.addView(this.f46474f, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f46473e;
        int i13 = g6.f23053d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        t0 t0Var3 = this.f46474f;
        if (t0Var3 != null) {
            this.d = true;
            t0Var3.setText(this.f46480y);
            t0 t0Var4 = this.f46474f;
            t0Var4.setSelection(t0Var4.getText().length());
            this.d = false;
        }
        this.f46477s = new z3(this, context, 11);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, g6.Pb, 0.2f);
        svgThumb.setColorKey(i12, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f46477s.getImageReceiver());
        sp spVar = new sp(svgThumb);
        this.f46476r = spVar;
        spVar.setCallback(this.f46477s);
        this.f46477s.setBackgroundColor(getThemedColor(i13));
        this.f46475n = new v0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f46477s, z5.c(-1.0f, -1));
        this.h.addView(this.f46475n, z5.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        k51 k51Var = new k51(this, new a8(this, 20), new r0(this, i11), null);
        this.f46470a = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.f46470a;
        k51Var2.U2.f26942r = false;
        frameLayout.addView(k51Var2, z5.c(-1.0f, -1));
        this.actionBar.B(this.f46470a, true);
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
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.f46479x == null && TextUtils.isEmpty(this.f46480y);
        if (!V() || z11) {
            return super.onBackPressed(z10);
        }
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
        this.f46470a.setPadding(0, 0, 0, i13);
        this.f46470a.setClipToPadding(false);
    }
}
