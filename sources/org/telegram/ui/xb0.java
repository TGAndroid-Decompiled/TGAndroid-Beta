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
public final class xb0 implements q0.a {
    public final int f43187a;
    public final nc0 f43188b;

    public xb0(nc0 nc0Var, int i10) {
        this.f43187a = i10;
        this.f43188b = nc0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f43187a) {
            case 0:
                nc0 nc0Var = this.f43188b;
                nc0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    nc0Var.f39503a0 = true;
                    nc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                nc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (nc0Var.I != null) {
                    nc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (nc0Var.N0) {
                        maxZoomLevel = nc0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = nc0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = nc0Var.f39536z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(nc0Var.f39509e0)) {
                            obj2.f37576c = nc0Var.getMessagesController().getUser(Long.valueOf(nc0Var.f39509e0));
                        } else {
                            obj2.d = nc0Var.getMessagesController().getChat(Long.valueOf(-nc0Var.f39509e0));
                        }
                        obj2.f37574a = nc0Var.f39509e0;
                        nc0Var.u0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = nc0Var.f0(obj2);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = nc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f37576c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f37577f = nc0Var.I.addMarker(flat);
                                }
                                nc0Var.f39512g0.add(obj2);
                                nc0Var.f39513h0.k(obj2, obj2.f37574a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = nc0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                hc0 b02 = nc0Var.b0(nc0Var.B0.messageOwner);
                                if (!nc0Var.k0()) {
                                    nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(nc0Var.f39533x0.getLatitude(), nc0Var.f39533x0.getLongitude());
                                try {
                                    nc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                nc0Var.f39511f0 = false;
                                nc0Var.k0();
                            }
                        } else {
                            Location location = new Location("network");
                            nc0Var.f39533x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = nc0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                nc0Var.f39533x0.setLatitude(nc0Var.A0.geo_point.lat);
                                nc0Var.f39533x0.setLongitude(nc0Var.A0.geo_point._long);
                                nc0Var.f39533x0.setAccuracy(nc0Var.A0.geo_point.accuracy_radius);
                                nc0Var.T.L(nc0Var.f39533x0);
                            } else {
                                location.setLatitude(20.659322d);
                                nc0Var.f39533x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        nc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    nc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    nc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    nc0Var.I.getUiSettings().setCompassEnabled(false);
                    nc0Var.I.setOnCameraMoveStartedListener(new tb0(nc0Var, 4));
                    nc0Var.I.setOnMyLocationChangeListener(new xb0(nc0Var, 1));
                    nc0Var.I.setOnMarkerClickListener(new m4.l0(nc0Var, maxZoomLevel));
                    nc0Var.I.setOnCameraMoveListener(new vb0(nc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            nc0Var.f39531w0 = location2;
                            nc0Var.s0(location2);
                            if (nc0Var.f39505b0 && nc0Var.getParentActivity() != null) {
                                nc0Var.f39505b0 = false;
                                nc0Var.c0();
                            }
                            imageView = nc0Var.f39506c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = nc0Var.getLocationController().getSharingLocationInfo(nc0Var.f39509e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                nc0Var.d0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    nc0Var.f39531w0 = location2;
                    nc0Var.s0(location2);
                    if (nc0Var.f39505b0) {
                        nc0Var.f39505b0 = false;
                        nc0Var.c0();
                    }
                    imageView = nc0Var.f39506c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                nc0 nc0Var2 = this.f43188b;
                Location location3 = (Location) obj;
                nc0Var2.s0(location3);
                nc0Var2.getLocationController().setMapLocation(location3, nc0Var2.f39508d0);
                nc0Var2.f39508d0 = false;
                return;
        }
    }
}
