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
public final class wc0 implements q0.a {
    public final int f38815a;
    public final kd0 f38816b;

    public wc0(kd0 kd0Var, int i10) {
        this.f38815a = i10;
        this.f38816b = kd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f38815a) {
            case 0:
                kd0 kd0Var = this.f38816b;
                kd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    kd0Var.f35116a0 = true;
                    kd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                kd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (kd0Var.I != null) {
                    kd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (kd0Var.N0) {
                        maxZoomLevel = kd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = kd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = kd0Var.f35149z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(kd0Var.f35122e0)) {
                            obj2.f33333c = kd0Var.getMessagesController().getUser(Long.valueOf(kd0Var.f35122e0));
                        } else {
                            obj2.d = kd0Var.getMessagesController().getChat(Long.valueOf(-kd0Var.f35122e0));
                        }
                        obj2.f33331a = kd0Var.f35122e0;
                        kd0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = kd0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = kd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f33333c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f33334f = kd0Var.I.addMarker(flat);
                                }
                                kd0Var.f35125g0.add(obj2);
                                kd0Var.f35126h0.k(obj2, obj2.f33331a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = kd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                ed0 c02 = kd0Var.c0(kd0Var.B0.messageOwner);
                                if (!kd0Var.l0()) {
                                    kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(kd0Var.f35146x0.getLatitude(), kd0Var.f35146x0.getLongitude());
                                try {
                                    kd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                kd0Var.f35124f0 = false;
                                kd0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            kd0Var.f35146x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = kd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                kd0Var.f35146x0.setLatitude(kd0Var.A0.geo_point.lat);
                                kd0Var.f35146x0.setLongitude(kd0Var.A0.geo_point._long);
                                kd0Var.f35146x0.setAccuracy(kd0Var.A0.geo_point.accuracy_radius);
                                kd0Var.T.L(kd0Var.f35146x0);
                            } else {
                                location.setLatitude(20.659322d);
                                kd0Var.f35146x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        kd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    kd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    kd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    kd0Var.I.getUiSettings().setCompassEnabled(false);
                    kd0Var.I.setOnCameraMoveStartedListener(new sc0(kd0Var, 4));
                    kd0Var.I.setOnMyLocationChangeListener(new wc0(kd0Var, 1));
                    kd0Var.I.setOnMarkerClickListener(new m4.g0(kd0Var, maxZoomLevel));
                    kd0Var.I.setOnCameraMoveListener(new uc0(kd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            kd0Var.f35144w0 = location2;
                            kd0Var.t0(location2);
                            if (kd0Var.f35118b0 && kd0Var.getParentActivity() != null) {
                                kd0Var.f35118b0 = false;
                                kd0Var.d0();
                            }
                            imageView = kd0Var.f35119c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = kd0Var.getLocationController().getSharingLocationInfo(kd0Var.f35122e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                kd0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    kd0Var.f35144w0 = location2;
                    kd0Var.t0(location2);
                    if (kd0Var.f35118b0) {
                        kd0Var.f35118b0 = false;
                        kd0Var.d0();
                    }
                    imageView = kd0Var.f35119c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                kd0 kd0Var2 = this.f38816b;
                Location location3 = (Location) obj;
                kd0Var2.t0(location3);
                kd0Var2.getLocationController().setMapLocation(location3, kd0Var2.f35121d0);
                kd0Var2.f35121d0 = false;
                return;
        }
    }
}
