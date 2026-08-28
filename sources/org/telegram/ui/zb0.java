package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class zb0 implements q0.a {
    public final int f45103a;
    public final pc0 f45104b;

    public zb0(pc0 pc0Var, int i9) {
        this.f45103a = i9;
        this.f45104b = pc0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i9;
        final float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.f45103a) {
            case 0:
                final pc0 pc0Var = this.f45104b;
                pc0Var.E = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6)) < 0.721f) {
                    i9 = R.raw.mapstyle_night;
                } else {
                    i9 = 0;
                }
                if (i9 != 0) {
                    pc0Var.W = true;
                    pc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i9));
                }
                pc0Var.E.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (pc0Var.E != null) {
                    pc0Var.G.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (pc0Var.J0) {
                        maxZoomLevel = pc0Var.E.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = pc0Var.E.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = pc0Var.f41469v0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(pc0Var.f41442a0)) {
                            obj2.f39438c = pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.f41442a0));
                        } else {
                            obj2.d = pc0Var.getMessagesController().getChat(Long.valueOf(-pc0Var.f41442a0));
                        }
                        obj2.f39436a = pc0Var.f41442a0;
                        pc0Var.u0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = pc0Var.f0(obj2);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                obj2.f39439e = pc0Var.E.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f39438c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f39440f = pc0Var.E.addMarker(flat);
                                }
                                pc0Var.f41446c0.add(obj2);
                                pc0Var.f41447d0.k(obj2, obj2.f39436a);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.f39439e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = pc0Var.f41473x0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                jc0 b02 = pc0Var.b0(pc0Var.f41473x0.messageOwner);
                                if (!pc0Var.k0()) {
                                    pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.f39439e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(pc0Var.f41467t0.getLatitude(), pc0Var.f41467t0.getLongitude());
                                try {
                                    pc0Var.E.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                pc0Var.f41444b0 = false;
                                pc0Var.k0();
                            }
                        } else {
                            Location location = new Location("network");
                            pc0Var.f41467t0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pc0Var.f41471w0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                pc0Var.f41467t0.setLatitude(pc0Var.f41471w0.geo_point.lat);
                                pc0Var.f41467t0.setLongitude(pc0Var.f41471w0.geo_point._long);
                                pc0Var.f41467t0.setAccuracy(pc0Var.f41471w0.geo_point.accuracy_radius);
                                pc0Var.P.L(pc0Var.f41467t0);
                            } else {
                                location.setLatitude(20.659322d);
                                pc0Var.f41467t0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        pc0Var.E.setMyLocationEnabled(true);
                    } catch (Exception e12) {
                        FileLog.e((Throwable) e12, false);
                    }
                    pc0Var.E.getUiSettings().setMyLocationButtonEnabled(false);
                    pc0Var.E.getUiSettings().setZoomControlsEnabled(false);
                    pc0Var.E.getUiSettings().setCompassEnabled(false);
                    pc0Var.E.setOnCameraMoveStartedListener(new vb0(pc0Var, 4));
                    pc0Var.E.setOnMyLocationChangeListener(new zb0(pc0Var, 1));
                    pc0Var.E.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
                        @Override
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            int i11;
                            int i12;
                            int i13;
                            pc0 pc0Var2 = pc0.this;
                            ArrayList arrayList = pc0Var2.f41446c0;
                            if (iMarker.getTag() instanceof oc0) {
                                pc0Var2.T.setVisibility(4);
                                if (!pc0Var2.f41475y0) {
                                    ImageView imageView2 = pc0Var2.f41441a;
                                    int i14 = org.telegram.ui.ActionBar.f6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(pc0Var2.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                                    pc0Var2.f41441a.setTag(Integer.valueOf(i14));
                                    pc0Var2.f41475y0 = true;
                                }
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= arrayList.size()) {
                                        break;
                                    }
                                    jc0 jc0Var = (jc0) arrayList.get(i15);
                                    if (jc0Var != null && jc0Var.f39439e == iMarker) {
                                        pc0Var2.f41449e0 = jc0Var.f39436a;
                                        if (pc0Var2.f41451f0) {
                                            pc0Var2.f41451f0 = false;
                                            pc0Var2.B0();
                                        }
                                        pc0Var2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.f39439e.getPosition(), maxZoomLevel));
                                    } else {
                                        i15++;
                                    }
                                }
                                mc0 mc0Var = pc0Var2.f41472x;
                                pc0 pc0Var3 = mc0Var.f40391b;
                                HashMap hashMap = mc0Var.f40390a;
                                oc0 oc0Var = (oc0) iMarker.getTag();
                                if (oc0Var != null && pc0Var3.f41455j0 != oc0Var) {
                                    pc0Var3.x0(false);
                                    IMapsProvider.IMarker iMarker2 = pc0Var3.f41454i0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            mc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        pc0Var3.f41454i0 = null;
                                    }
                                    pc0Var3.f41455j0 = oc0Var;
                                    pc0Var3.f41454i0 = iMarker;
                                    Context context = mc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    mc0Var.addView(frameLayout, g7.e6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    pc0Var3.f41456k0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    pc0Var3.f41456k0.getBackground().setColorFilter(new PorterDuffColorFilter(pc0Var3.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(pc0Var3.f41456k0, g7.e6.c(71.0f, -2));
                                    pc0Var3.f41456k0.setAlpha(0.0f);
                                    pc0Var3.f41456k0.setOnClickListener(new v80(4, mc0Var, oc0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(pc0Var3.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    int i16 = 3;
                                    if (LocaleController.isRTL) {
                                        i11 = 5;
                                    } else {
                                        i11 = 3;
                                    }
                                    textView.setGravity(i11);
                                    FrameLayout frameLayout3 = pc0Var3.f41456k0;
                                    if (LocaleController.isRTL) {
                                        i12 = 5;
                                    } else {
                                        i12 = 3;
                                    }
                                    TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout3, textView, g7.e6.d(-2, -2.0f, i12 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    g10.setTextSize(1, 14.0f);
                                    g10.setMaxLines(1);
                                    g10.setEllipsize(truncateAt);
                                    g10.setSingleLine(true);
                                    g10.setTextColor(pc0Var3.getThemedColor(org.telegram.ui.ActionBar.f6.A6));
                                    if (LocaleController.isRTL) {
                                        i13 = 5;
                                    } else {
                                        i13 = 3;
                                    }
                                    g10.setGravity(i13);
                                    FrameLayout frameLayout4 = pc0Var3.f41456k0;
                                    if (LocaleController.isRTL) {
                                        i16 = 5;
                                    }
                                    frameLayout4.addView(g10, g7.e6.d(-2, -2.0f, i16 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(oc0Var.f41055c.title);
                                    g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    frameLayout5.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(oc0Var.f41053a)));
                                    frameLayout.addView(frameLayout5, g7.e6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                                    o9Var.f(aa.d.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), oc0Var.f41055c.venue_type, "_64.png"), null, null);
                                    frameLayout5.addView(o9Var, g7.e6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new lc0(mc0Var, frameLayout5));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    pc0Var3.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    pc0Var.E.setOnCameraMoveListener(new xb0(pc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            pc0Var.f41466s0 = location2;
                            pc0Var.s0(location2);
                            if (pc0Var.X && pc0Var.getParentActivity() != null) {
                                pc0Var.X = false;
                                pc0Var.c0();
                            }
                            imageView = pc0Var.f41445c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f41442a0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                pc0Var.d0(i10);
                                return;
                            }
                            return;
                        }
                    }
                    pc0Var.f41466s0 = location2;
                    pc0Var.s0(location2);
                    if (pc0Var.X) {
                        pc0Var.X = false;
                        pc0Var.c0();
                    }
                    imageView = pc0Var.f41445c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                pc0 pc0Var2 = this.f45104b;
                Location location3 = (Location) obj;
                pc0Var2.s0(location3);
                pc0Var2.getLocationController().setMapLocation(location3, pc0Var2.Z);
                pc0Var2.Z = false;
                return;
        }
    }
}
