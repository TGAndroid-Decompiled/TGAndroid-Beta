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
public final class xc0 implements q0.a {
    public final int f41541a;
    public final ld0 f41542b;

    public xc0(ld0 ld0Var, int i10) {
        this.f41541a = i10;
        this.f41542b = ld0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f41541a) {
            case 0:
                ld0 ld0Var = this.f41542b;
                ld0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    ld0Var.f37684a0 = true;
                    ld0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                ld0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (ld0Var.I != null) {
                    ld0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (ld0Var.N0) {
                        maxZoomLevel = ld0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = ld0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = ld0Var.f37717z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(ld0Var.f37690e0)) {
                            obj2.f35510c = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.f37690e0));
                        } else {
                            obj2.d = ld0Var.getMessagesController().getChat(Long.valueOf(-ld0Var.f37690e0));
                        }
                        obj2.f35508a = ld0Var.f37690e0;
                        ld0Var.u0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = ld0Var.f0(obj2);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = ld0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f35510c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f35511f = ld0Var.I.addMarker(flat);
                                }
                                ld0Var.f37693g0.add(obj2);
                                ld0Var.f37694h0.k(obj2, obj2.f35508a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = ld0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                fd0 b02 = ld0Var.b0(ld0Var.B0.messageOwner);
                                if (!ld0Var.k0()) {
                                    ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(ld0Var.f37714x0.getLatitude(), ld0Var.f37714x0.getLongitude());
                                try {
                                    ld0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                ld0Var.f37692f0 = false;
                                ld0Var.k0();
                            }
                        } else {
                            Location location = new Location("network");
                            ld0Var.f37714x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = ld0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                ld0Var.f37714x0.setLatitude(ld0Var.A0.geo_point.lat);
                                ld0Var.f37714x0.setLongitude(ld0Var.A0.geo_point._long);
                                ld0Var.f37714x0.setAccuracy(ld0Var.A0.geo_point.accuracy_radius);
                                ld0Var.T.L(ld0Var.f37714x0);
                            } else {
                                location.setLatitude(20.659322d);
                                ld0Var.f37714x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        ld0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    ld0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    ld0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    ld0Var.I.getUiSettings().setCompassEnabled(false);
                    ld0Var.I.setOnCameraMoveStartedListener(new tc0(ld0Var, 4));
                    ld0Var.I.setOnMyLocationChangeListener(new xc0(ld0Var, 1));
                    ld0Var.I.setOnMarkerClickListener(new m4.l0(ld0Var, maxZoomLevel));
                    ld0Var.I.setOnCameraMoveListener(new vc0(ld0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            ld0Var.f37712w0 = location2;
                            ld0Var.s0(location2);
                            if (ld0Var.f37686b0 && ld0Var.getParentActivity() != null) {
                                ld0Var.f37686b0 = false;
                                ld0Var.c0();
                            }
                            imageView = ld0Var.f37687c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                ld0Var.d0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    ld0Var.f37712w0 = location2;
                    ld0Var.s0(location2);
                    if (ld0Var.f37686b0) {
                        ld0Var.f37686b0 = false;
                        ld0Var.c0();
                    }
                    imageView = ld0Var.f37687c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                ld0 ld0Var2 = this.f41542b;
                Location location3 = (Location) obj;
                ld0Var2.s0(location3);
                ld0Var2.getLocationController().setMapLocation(location3, ld0Var2.f37689d0);
                ld0Var2.f37689d0 = false;
                return;
        }
    }
}
