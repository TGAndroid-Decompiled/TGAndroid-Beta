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
public final class rc0 implements q0.a {
    public final int f37097a;
    public final fd0 f37098b;

    public rc0(fd0 fd0Var, int i10) {
        this.f37097a = i10;
        this.f37098b = fd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f37097a) {
            case 0:
                fd0 fd0Var = this.f37098b;
                fd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    fd0Var.f33487a0 = true;
                    fd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                fd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (fd0Var.I != null) {
                    fd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (fd0Var.N0) {
                        maxZoomLevel = fd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = fd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = fd0Var.f33520z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(fd0Var.f33493e0)) {
                            obj2.f40467c = fd0Var.getMessagesController().getUser(Long.valueOf(fd0Var.f33493e0));
                        } else {
                            obj2.d = fd0Var.getMessagesController().getChat(Long.valueOf(-fd0Var.f33493e0));
                        }
                        obj2.f40465a = fd0Var.f33493e0;
                        fd0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = fd0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = fd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f40467c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f40468f = fd0Var.I.addMarker(flat);
                                }
                                fd0Var.f33496g0.add(obj2);
                                fd0Var.f33497h0.k(obj2, obj2.f40465a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        fd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = fd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                zc0 c02 = fd0Var.c0(fd0Var.B0.messageOwner);
                                if (!fd0Var.l0()) {
                                    fd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(fd0Var.f33517x0.getLatitude(), fd0Var.f33517x0.getLongitude());
                                try {
                                    fd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                fd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                fd0Var.f33495f0 = false;
                                fd0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            fd0Var.f33517x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = fd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                fd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                fd0Var.f33517x0.setLatitude(fd0Var.A0.geo_point.lat);
                                fd0Var.f33517x0.setLongitude(fd0Var.A0.geo_point._long);
                                fd0Var.f33517x0.setAccuracy(fd0Var.A0.geo_point.accuracy_radius);
                                fd0Var.T.L(fd0Var.f33517x0);
                            } else {
                                location.setLatitude(20.659322d);
                                fd0Var.f33517x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        fd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    fd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    fd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    fd0Var.I.getUiSettings().setCompassEnabled(false);
                    fd0Var.I.setOnCameraMoveStartedListener(new nc0(fd0Var, 4));
                    fd0Var.I.setOnMyLocationChangeListener(new rc0(fd0Var, 1));
                    fd0Var.I.setOnMarkerClickListener(new m4.g0(fd0Var, maxZoomLevel));
                    fd0Var.I.setOnCameraMoveListener(new pc0(fd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            fd0Var.f33515w0 = location2;
                            fd0Var.t0(location2);
                            if (fd0Var.f33489b0 && fd0Var.getParentActivity() != null) {
                                fd0Var.f33489b0 = false;
                                fd0Var.d0();
                            }
                            imageView = fd0Var.f33490c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = fd0Var.getLocationController().getSharingLocationInfo(fd0Var.f33493e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                fd0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    fd0Var.f33515w0 = location2;
                    fd0Var.t0(location2);
                    if (fd0Var.f33489b0) {
                        fd0Var.f33489b0 = false;
                        fd0Var.d0();
                    }
                    imageView = fd0Var.f33490c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                fd0 fd0Var2 = this.f37098b;
                Location location3 = (Location) obj;
                fd0Var2.t0(location3);
                fd0Var2.getLocationController().setMapLocation(location3, fd0Var2.f33492d0);
                fd0Var2.f33492d0 = false;
                return;
        }
    }
}
