package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLRPC;
public final class tb0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.a2, IMapsProvider.OnCameraMoveStartedListener, hg.b, IMapsProvider.ITouchInterceptor {
    public final int f41627a;
    public final nc0 f41628b;

    public tb0(nc0 nc0Var, int i10) {
        this.f41627a = i10;
        this.f41628b = nc0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f41627a) {
            case 5:
                nc0 nc0Var = this.f41628b;
                ArrayList arrayList2 = nc0Var.f39510k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((mc0) arrayList2.get(i10)).f39204b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(nc0Var.e0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f39203a = i11;
                            IMapsProvider.IMarker addMarker = nc0Var.I.addMarker(position);
                            obj.f39204b = addMarker;
                            obj.f39205c = tL_messageMediaVenue;
                            addMarker.setTag(obj);
                            arrayList2.add(obj);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    return;
                }
                return;
            default:
                nc0 nc0Var2 = this.f41628b;
                nc0Var2.f39521t0 = false;
                nc0Var2.A0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41627a) {
            case 1:
                nc0 nc0Var = this.f41628b;
                if (nc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        nc0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                nc0 nc0Var2 = this.f41628b;
                if (nc0Var2.getParentActivity() != null) {
                    try {
                        nc0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void j(int i10) {
        IMapsProvider.IMap iMap = this.f41628b.I;
        if (iMap != null) {
            if (i10 == 2) {
                iMap.setMapType(0);
            } else if (i10 == 3) {
                iMap.setMapType(1);
            } else if (i10 == 4) {
                iMap.setMapType(2);
            }
        }
    }

    @Override
    public void onCameraMoveStarted(int i10) {
        View childAt;
        s4.b1 T;
        int dp;
        nc0 nc0Var = this.f41628b;
        int i11 = nc0Var.G0;
        if (i10 == 1) {
            nc0Var.x0(true);
            if (nc0Var.m0 != null) {
                nc0Var.X.setVisibility(0);
                kc0 kc0Var = nc0Var.f39526x;
                IMapsProvider.IMarker iMarker = nc0Var.m0;
                HashMap hashMap = kc0Var.f38507a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    kc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                nc0Var.m0 = null;
                nc0Var.f39513n0 = null;
                nc0Var.f39514o0 = null;
            }
            nc0Var.f39508i0 = -1L;
            if (nc0Var.f39509j0) {
                nc0Var.f39509j0 = false;
                nc0Var.B0();
            }
            if (!nc0Var.Q) {
                if ((i11 == 0 || i11 == 1) && nc0Var.U.getChildCount() > 0 && (childAt = nc0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.im0 im0Var = nc0Var.U;
                    View F = im0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = im0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = nc0Var.I.getCameraPosition();
                            nc0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            nc0Var.U.v0(0, top + dp, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f41627a;
        nc0 nc0Var = this.f41628b;
        switch (i10) {
            case 6:
                if (nc0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-nc0Var.N) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (nc0Var.B0 == null && nc0Var.f39530z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = nc0Var.f39511l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        nc0Var.f39511l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        nc0Var.f39511l0.playTogether(ObjectAnimator.ofFloat(nc0Var.X, View.TRANSLATION_Y, nc0Var.f39529y0 - AndroidUtilities.dp(10.0f)));
                        nc0Var.f39511l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = nc0Var.f39511l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        nc0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        nc0Var.f39511l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        nc0Var.f39511l0.playTogether(ObjectAnimator.ofFloat(nc0Var.X, View.TRANSLATION_Y, nc0Var.f39529y0));
                        nc0Var.f39511l0.start();
                        nc0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!nc0Var.C0) {
                            ImageView imageView = nc0Var.f39496a;
                            int i11 = org.telegram.ui.ActionBar.h6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(nc0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            nc0Var.f39496a.setTag(Integer.valueOf(i11));
                            nc0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = nc0Var.I;
                        if (iMap != null && (location = nc0Var.f39527x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            nc0Var.f39527x0.setLongitude(nc0Var.I.getCameraPosition().target.longitude);
                        }
                        nc0Var.T.L(nc0Var.f39527x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
