package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class sc0 implements q0.a {
    public final int f41738a;
    public final gd0 f41739b;

    public sc0(gd0 gd0Var, int i10) {
        this.f41738a = i10;
        this.f41739b = gd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f41738a) {
            case 0:
                gd0 gd0Var = this.f41739b;
                gd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(gd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    gd0Var.f38048a0 = true;
                    gd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                gd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (gd0Var.I != null) {
                    gd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (gd0Var.N0) {
                        maxZoomLevel = gd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = gd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = gd0Var.f38082z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(gd0Var.f38055e0)) {
                            obj2.f36075c = gd0Var.getMessagesController().getUser(Long.valueOf(gd0Var.f38055e0));
                        } else {
                            obj2.d = gd0Var.getMessagesController().getChat(Long.valueOf(-gd0Var.f38055e0));
                        }
                        obj2.f36073a = gd0Var.f38055e0;
                        gd0Var.u0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = gd0Var.f0(obj2);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                obj2.f36076e = gd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f36075c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f36077f = gd0Var.I.addMarker(flat);
                                }
                                gd0Var.f38058g0.add(obj2);
                                gd0Var.f38059h0.k(obj2, obj2.f36073a);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.f36076e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = gd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                ad0 b02 = gd0Var.b0(gd0Var.B0.messageOwner);
                                if (!gd0Var.k0()) {
                                    gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.f36076e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(gd0Var.f38079x0.getLatitude(), gd0Var.f38079x0.getLongitude());
                                try {
                                    gd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                gd0Var.f38057f0 = false;
                                gd0Var.k0();
                            }
                        } else {
                            Location location = new Location("network");
                            gd0Var.f38079x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = gd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                gd0Var.f38079x0.setLatitude(gd0Var.A0.geo_point.lat);
                                gd0Var.f38079x0.setLongitude(gd0Var.A0.geo_point._long);
                                gd0Var.f38079x0.setAccuracy(gd0Var.A0.geo_point.accuracy_radius);
                                gd0Var.T.L(gd0Var.f38079x0);
                            } else {
                                location.setLatitude(20.659322d);
                                gd0Var.f38079x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        gd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    gd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    gd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    gd0Var.I.getUiSettings().setCompassEnabled(false);
                    gd0Var.I.setOnCameraMoveStartedListener(new oc0(gd0Var, 4));
                    gd0Var.I.setOnMyLocationChangeListener(new sc0(gd0Var, 1));
                    gd0Var.I.setOnMarkerClickListener(new m4.h0(gd0Var, maxZoomLevel));
                    gd0Var.I.setOnCameraMoveListener(new qc0(gd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            gd0Var.f38077w0 = location2;
                            gd0Var.s0(location2);
                            if (gd0Var.f38050b0 && gd0Var.getParentActivity() != null) {
                                gd0Var.f38050b0 = false;
                                gd0Var.c0();
                            }
                            imageView = gd0Var.f38051c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = gd0Var.getLocationController().getSharingLocationInfo(gd0Var.f38055e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                gd0Var.d0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    gd0Var.f38077w0 = location2;
                    gd0Var.s0(location2);
                    if (gd0Var.f38050b0) {
                        gd0Var.f38050b0 = false;
                        gd0Var.c0();
                    }
                    imageView = gd0Var.f38051c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                gd0 gd0Var2 = this.f41739b;
                Location location3 = (Location) obj;
                gd0Var2.s0(location3);
                gd0Var2.getLocationController().setMapLocation(location3, gd0Var2.f38053d0);
                gd0Var2.f38053d0 = false;
                return;
        }
    }
}
