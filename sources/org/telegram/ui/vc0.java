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
public final class vc0 implements q0.a {
    public final int f38451a;
    public final jd0 f38452b;

    public vc0(jd0 jd0Var, int i10) {
        this.f38451a = i10;
        this.f38452b = jd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f38451a) {
            case 0:
                jd0 jd0Var = this.f38452b;
                jd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    jd0Var.f34812a0 = true;
                    jd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                jd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (jd0Var.I != null) {
                    jd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (jd0Var.N0) {
                        maxZoomLevel = jd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = jd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = jd0Var.f34845z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(jd0Var.f34818e0)) {
                            obj2.f32942c = jd0Var.getMessagesController().getUser(Long.valueOf(jd0Var.f34818e0));
                        } else {
                            obj2.d = jd0Var.getMessagesController().getChat(Long.valueOf(-jd0Var.f34818e0));
                        }
                        obj2.f32940a = jd0Var.f34818e0;
                        jd0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = jd0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = jd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f32942c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f32943f = jd0Var.I.addMarker(flat);
                                }
                                jd0Var.f34821g0.add(obj2);
                                jd0Var.f34822h0.k(obj2, obj2.f32940a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        jd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = jd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                dd0 c02 = jd0Var.c0(jd0Var.B0.messageOwner);
                                if (!jd0Var.l0()) {
                                    jd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(jd0Var.f34842x0.getLatitude(), jd0Var.f34842x0.getLongitude());
                                try {
                                    jd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                jd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                jd0Var.f34820f0 = false;
                                jd0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            jd0Var.f34842x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = jd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                jd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                jd0Var.f34842x0.setLatitude(jd0Var.A0.geo_point.lat);
                                jd0Var.f34842x0.setLongitude(jd0Var.A0.geo_point._long);
                                jd0Var.f34842x0.setAccuracy(jd0Var.A0.geo_point.accuracy_radius);
                                jd0Var.T.L(jd0Var.f34842x0);
                            } else {
                                location.setLatitude(20.659322d);
                                jd0Var.f34842x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        jd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    jd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    jd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    jd0Var.I.getUiSettings().setCompassEnabled(false);
                    jd0Var.I.setOnCameraMoveStartedListener(new rc0(jd0Var, 4));
                    jd0Var.I.setOnMyLocationChangeListener(new vc0(jd0Var, 1));
                    jd0Var.I.setOnMarkerClickListener(new m4.g0(jd0Var, maxZoomLevel));
                    jd0Var.I.setOnCameraMoveListener(new tc0(jd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            jd0Var.f34840w0 = location2;
                            jd0Var.t0(location2);
                            if (jd0Var.f34814b0 && jd0Var.getParentActivity() != null) {
                                jd0Var.f34814b0 = false;
                                jd0Var.d0();
                            }
                            imageView = jd0Var.f34815c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = jd0Var.getLocationController().getSharingLocationInfo(jd0Var.f34818e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                jd0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    jd0Var.f34840w0 = location2;
                    jd0Var.t0(location2);
                    if (jd0Var.f34814b0) {
                        jd0Var.f34814b0 = false;
                        jd0Var.d0();
                    }
                    imageView = jd0Var.f34815c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                jd0 jd0Var2 = this.f38452b;
                Location location3 = (Location) obj;
                jd0Var2.t0(location3);
                jd0Var2.getLocationController().setMapLocation(location3, jd0Var2.f34817d0);
                jd0Var2.f34817d0 = false;
                return;
        }
    }
}
