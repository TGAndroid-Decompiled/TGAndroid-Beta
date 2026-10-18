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
public final class zb0 implements q0.a {
    public final int f43738a;
    public final pc0 f43739b;

    public zb0(pc0 pc0Var, int i10) {
        this.f43738a = i10;
        this.f43739b = pc0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f43738a) {
            case 0:
                pc0 pc0Var = this.f43739b;
                pc0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    pc0Var.f40057a0 = true;
                    pc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                pc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (pc0Var.I != null) {
                    pc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (pc0Var.N0) {
                        maxZoomLevel = pc0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = pc0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = pc0Var.f40090z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(pc0Var.f40063e0)) {
                            obj2.f38129c = pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.f40063e0));
                        } else {
                            obj2.d = pc0Var.getMessagesController().getChat(Long.valueOf(-pc0Var.f40063e0));
                        }
                        obj2.f38127a = pc0Var.f40063e0;
                        pc0Var.u0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = pc0Var.f0(obj2);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = pc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f38129c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f38130f = pc0Var.I.addMarker(flat);
                                }
                                pc0Var.f40066g0.add(obj2);
                                pc0Var.f40067h0.k(obj2, obj2.f38127a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = pc0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                jc0 b02 = pc0Var.b0(pc0Var.B0.messageOwner);
                                if (!pc0Var.k0()) {
                                    pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(pc0Var.f40087x0.getLatitude(), pc0Var.f40087x0.getLongitude());
                                try {
                                    pc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                pc0Var.f40065f0 = false;
                                pc0Var.k0();
                            }
                        } else {
                            Location location = new Location("network");
                            pc0Var.f40087x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pc0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                pc0Var.f40087x0.setLatitude(pc0Var.A0.geo_point.lat);
                                pc0Var.f40087x0.setLongitude(pc0Var.A0.geo_point._long);
                                pc0Var.f40087x0.setAccuracy(pc0Var.A0.geo_point.accuracy_radius);
                                pc0Var.T.L(pc0Var.f40087x0);
                            } else {
                                location.setLatitude(20.659322d);
                                pc0Var.f40087x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        pc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    pc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    pc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    pc0Var.I.getUiSettings().setCompassEnabled(false);
                    pc0Var.I.setOnCameraMoveStartedListener(new vb0(pc0Var, 4));
                    pc0Var.I.setOnMyLocationChangeListener(new zb0(pc0Var, 1));
                    pc0Var.I.setOnMarkerClickListener(new m4.l0(pc0Var, maxZoomLevel));
                    pc0Var.I.setOnCameraMoveListener(new xb0(pc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            pc0Var.f40085w0 = location2;
                            pc0Var.s0(location2);
                            if (pc0Var.f40059b0 && pc0Var.getParentActivity() != null) {
                                pc0Var.f40059b0 = false;
                                pc0Var.c0();
                            }
                            imageView = pc0Var.f40060c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f40063e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                pc0Var.d0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    pc0Var.f40085w0 = location2;
                    pc0Var.s0(location2);
                    if (pc0Var.f40059b0) {
                        pc0Var.f40059b0 = false;
                        pc0Var.c0();
                    }
                    imageView = pc0Var.f40060c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                pc0 pc0Var2 = this.f43739b;
                Location location3 = (Location) obj;
                pc0Var2.s0(location3);
                pc0Var2.getLocationController().setMapLocation(location3, pc0Var2.f40062d0);
                pc0Var2.f40062d0 = false;
                return;
        }
    }
}
