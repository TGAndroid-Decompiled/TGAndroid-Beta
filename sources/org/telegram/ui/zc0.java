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
public final class zc0 implements q0.a {
    public final int f42591a;
    public final nd0 f42592b;

    public zc0(nd0 nd0Var, int i10) {
        this.f42591a = i10;
        this.f42592b = nd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f42591a) {
            case 0:
                nd0 nd0Var = this.f42592b;
                nd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    nd0Var.f38648a0 = true;
                    nd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                nd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (nd0Var.I != null) {
                    nd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (nd0Var.N0) {
                        maxZoomLevel = nd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = nd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = nd0Var.f38681z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(nd0Var.f38654e0)) {
                            obj2.f36760c = nd0Var.getMessagesController().getUser(Long.valueOf(nd0Var.f38654e0));
                        } else {
                            obj2.d = nd0Var.getMessagesController().getChat(Long.valueOf(-nd0Var.f38654e0));
                        }
                        obj2.f36758a = nd0Var.f38654e0;
                        nd0Var.u0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = nd0Var.f0(obj2);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = nd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f36760c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f36761f = nd0Var.I.addMarker(flat);
                                }
                                nd0Var.f38657g0.add(obj2);
                                nd0Var.f38658h0.k(obj2, obj2.f36758a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = nd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                hd0 b02 = nd0Var.b0(nd0Var.B0.messageOwner);
                                if (!nd0Var.k0()) {
                                    nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(nd0Var.f38678x0.getLatitude(), nd0Var.f38678x0.getLongitude());
                                try {
                                    nd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                nd0Var.f38656f0 = false;
                                nd0Var.k0();
                            }
                        } else {
                            Location location = new Location("network");
                            nd0Var.f38678x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = nd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                nd0Var.f38678x0.setLatitude(nd0Var.A0.geo_point.lat);
                                nd0Var.f38678x0.setLongitude(nd0Var.A0.geo_point._long);
                                nd0Var.f38678x0.setAccuracy(nd0Var.A0.geo_point.accuracy_radius);
                                nd0Var.T.L(nd0Var.f38678x0);
                            } else {
                                location.setLatitude(20.659322d);
                                nd0Var.f38678x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        nd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    nd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    nd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    nd0Var.I.getUiSettings().setCompassEnabled(false);
                    nd0Var.I.setOnCameraMoveStartedListener(new uc0(nd0Var, 4));
                    nd0Var.I.setOnMyLocationChangeListener(new zc0(nd0Var, 1));
                    nd0Var.I.setOnMarkerClickListener(new m4.m0(nd0Var, maxZoomLevel));
                    nd0Var.I.setOnCameraMoveListener(new xc0(nd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            nd0Var.f38676w0 = location2;
                            nd0Var.s0(location2);
                            if (nd0Var.f38650b0 && nd0Var.getParentActivity() != null) {
                                nd0Var.f38650b0 = false;
                                nd0Var.c0();
                            }
                            imageView = nd0Var.f38651c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = nd0Var.getLocationController().getSharingLocationInfo(nd0Var.f38654e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                nd0Var.d0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    nd0Var.f38676w0 = location2;
                    nd0Var.s0(location2);
                    if (nd0Var.f38650b0) {
                        nd0Var.f38650b0 = false;
                        nd0Var.c0();
                    }
                    imageView = nd0Var.f38651c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                nd0 nd0Var2 = this.f42592b;
                Location location3 = (Location) obj;
                nd0Var2.s0(location3);
                nd0Var2.getLocationController().setMapLocation(location3, nd0Var2.f38653d0);
                nd0Var2.f38653d0 = false;
                return;
        }
    }
}
