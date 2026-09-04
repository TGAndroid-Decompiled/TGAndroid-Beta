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
public final class uc0 implements q0.a {
    public final int f41063a;
    public final id0 f41064b;

    public uc0(id0 id0Var, int i10) {
        this.f41063a = i10;
        this.f41064b = id0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f41063a) {
            case 0:
                id0 id0Var = this.f41064b;
                id0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    id0Var.f37304a0 = true;
                    id0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                id0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (id0Var.I != null) {
                    id0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (id0Var.N0) {
                        maxZoomLevel = id0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = id0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = id0Var.f37338z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(id0Var.f37311e0)) {
                            obj2.f35075c = id0Var.getMessagesController().getUser(Long.valueOf(id0Var.f37311e0));
                        } else {
                            obj2.d = id0Var.getMessagesController().getChat(Long.valueOf(-id0Var.f37311e0));
                        }
                        obj2.f35073a = id0Var.f37311e0;
                        id0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = id0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.f35076e = id0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f35075c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f35077f = id0Var.I.addMarker(flat);
                                }
                                id0Var.f37314g0.add(obj2);
                                id0Var.f37315h0.k(obj2, obj2.f35073a);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        id0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.f35076e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = id0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                cd0 c02 = id0Var.c0(id0Var.B0.messageOwner);
                                if (!id0Var.l0()) {
                                    id0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.f35076e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(id0Var.f37335x0.getLatitude(), id0Var.f37335x0.getLongitude());
                                try {
                                    id0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                id0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                id0Var.f37313f0 = false;
                                id0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            id0Var.f37335x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = id0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                id0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                id0Var.f37335x0.setLatitude(id0Var.A0.geo_point.lat);
                                id0Var.f37335x0.setLongitude(id0Var.A0.geo_point._long);
                                id0Var.f37335x0.setAccuracy(id0Var.A0.geo_point.accuracy_radius);
                                id0Var.T.L(id0Var.f37335x0);
                            } else {
                                location.setLatitude(20.659322d);
                                id0Var.f37335x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        id0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    id0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    id0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    id0Var.I.getUiSettings().setCompassEnabled(false);
                    id0Var.I.setOnCameraMoveStartedListener(new qc0(id0Var, 4));
                    id0Var.I.setOnMyLocationChangeListener(new uc0(id0Var, 1));
                    id0Var.I.setOnMarkerClickListener(new m4.g0(id0Var, maxZoomLevel));
                    id0Var.I.setOnCameraMoveListener(new sc0(id0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            id0Var.f37333w0 = location2;
                            id0Var.t0(location2);
                            if (id0Var.f37306b0 && id0Var.getParentActivity() != null) {
                                id0Var.f37306b0 = false;
                                id0Var.d0();
                            }
                            imageView = id0Var.f37307c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f37311e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                id0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    id0Var.f37333w0 = location2;
                    id0Var.t0(location2);
                    if (id0Var.f37306b0) {
                        id0Var.f37306b0 = false;
                        id0Var.d0();
                    }
                    imageView = id0Var.f37307c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                id0 id0Var2 = this.f41064b;
                Location location3 = (Location) obj;
                id0Var2.t0(location3);
                id0Var2.getLocationController().setMapLocation(location3, id0Var2.f37309d0);
                id0Var2.f37309d0 = false;
                return;
        }
    }
}
