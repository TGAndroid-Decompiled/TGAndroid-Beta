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
public final class tc0 implements q0.a {
    public final int f41974a;
    public final hd0 f41975b;

    public tc0(hd0 hd0Var, int i10) {
        this.f41974a = i10;
        this.f41975b = hd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f41974a) {
            case 0:
                hd0 hd0Var = this.f41975b;
                hd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    hd0Var.f38256a0 = true;
                    hd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                hd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (hd0Var.I != null) {
                    hd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (hd0Var.N0) {
                        maxZoomLevel = hd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = hd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = hd0Var.f38290z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(hd0Var.f38263e0)) {
                            obj2.f36284c = hd0Var.getMessagesController().getUser(Long.valueOf(hd0Var.f38263e0));
                        } else {
                            obj2.d = hd0Var.getMessagesController().getChat(Long.valueOf(-hd0Var.f38263e0));
                        }
                        obj2.f36282a = hd0Var.f38263e0;
                        hd0Var.u0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = hd0Var.f0(obj2);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                obj2.f36285e = hd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f36284c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f36286f = hd0Var.I.addMarker(flat);
                                }
                                hd0Var.f38266g0.add(obj2);
                                hd0Var.f38267h0.k(obj2, obj2.f36282a);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        hd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.f36285e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = hd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                bd0 b02 = hd0Var.b0(hd0Var.B0.messageOwner);
                                if (!hd0Var.k0()) {
                                    hd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.f36285e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(hd0Var.f38287x0.getLatitude(), hd0Var.f38287x0.getLongitude());
                                try {
                                    hd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                hd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                hd0Var.f38265f0 = false;
                                hd0Var.k0();
                            }
                        } else {
                            Location location = new Location("network");
                            hd0Var.f38287x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = hd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                hd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                hd0Var.f38287x0.setLatitude(hd0Var.A0.geo_point.lat);
                                hd0Var.f38287x0.setLongitude(hd0Var.A0.geo_point._long);
                                hd0Var.f38287x0.setAccuracy(hd0Var.A0.geo_point.accuracy_radius);
                                hd0Var.T.L(hd0Var.f38287x0);
                            } else {
                                location.setLatitude(20.659322d);
                                hd0Var.f38287x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        hd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    hd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    hd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    hd0Var.I.getUiSettings().setCompassEnabled(false);
                    hd0Var.I.setOnCameraMoveStartedListener(new pc0(hd0Var, 4));
                    hd0Var.I.setOnMyLocationChangeListener(new tc0(hd0Var, 1));
                    hd0Var.I.setOnMarkerClickListener(new m4.h0(hd0Var, maxZoomLevel));
                    hd0Var.I.setOnCameraMoveListener(new rc0(hd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            hd0Var.f38285w0 = location2;
                            hd0Var.s0(location2);
                            if (hd0Var.f38258b0 && hd0Var.getParentActivity() != null) {
                                hd0Var.f38258b0 = false;
                                hd0Var.c0();
                            }
                            imageView = hd0Var.f38259c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38263e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                hd0Var.d0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    hd0Var.f38285w0 = location2;
                    hd0Var.s0(location2);
                    if (hd0Var.f38258b0) {
                        hd0Var.f38258b0 = false;
                        hd0Var.c0();
                    }
                    imageView = hd0Var.f38259c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                hd0 hd0Var2 = this.f41975b;
                Location location3 = (Location) obj;
                hd0Var2.s0(location3);
                hd0Var2.getLocationController().setMapLocation(location3, hd0Var2.f38261d0);
                hd0Var2.f38261d0 = false;
                return;
        }
    }
}
