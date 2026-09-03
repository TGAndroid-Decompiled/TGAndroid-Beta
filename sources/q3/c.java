package q3;

import a0.f;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.d;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.c0;
import android.support.v4.media.session.h;
import cb.e;
import h5.d0;
import j3.a2;
import j3.l0;
import j3.n2;
import j3.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n7.qa;
import vh.w2;
public final class c {
    public static final MediaMetadataCompat f42733l;
    public final c0 f42734a;
    public final Looper f42735b;
    public final a f42736c;
    public final ArrayList d;
    public final ArrayList e;
    public final b[] f42737f;
    public Map f42738g;
    public final qa h;
    public a2 f42739i;
    public final long f42740j;
    public final boolean f42741k;

    static {
        l0.a("goog.exo.mediasession");
        f42733l = new MediaMetadataCompat(new Bundle());
    }

    public c(c0 c0Var) {
        this.f42734a = c0Var;
        int i10 = d0.f6924a;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f42735b = myLooper;
        a aVar = new a(this);
        this.f42736c = aVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f42737f = new b[0];
        this.f42738g = Collections.EMPTY_MAP;
        this.h = new qa(c0Var.f262b);
        this.f42740j = 2360143L;
        c0Var.f261a.f283a.setFlags(3);
        c0Var.d(aVar, new Handler(myLooper));
        this.f42741k = true;
    }

    public static boolean a(c cVar, long j10) {
        if (cVar.f42739i != null && (j10 & cVar.f42740j) != 0) {
            return true;
        }
        return false;
    }

    public final void b() {
        a2 a2Var;
        long duration;
        ArrayList arrayList;
        Object obj;
        MediaMetadataCompat mediaMetadataCompat = f42733l;
        qa qaVar = this.h;
        if (qaVar != null && (a2Var = this.f42739i) != null) {
            af.c cVar = (af.c) qaVar.f14687b;
            String str = (String) qaVar.f14688c;
            if (!a2Var.z().p()) {
                d dVar = new d();
                if (a2Var.f()) {
                    dVar.d(1L, "android.media.metadata.ADVERTISEMENT");
                }
                e eVar = (e) a2Var;
                o2 z4 = eVar.z();
                if ((!z4.p() && z4.m(eVar.x(), (n2) eVar.f2238a, 0L).f8736r) || a2Var.getDuration() == -9223372036854775807L) {
                    duration = -1;
                } else {
                    duration = a2Var.getDuration();
                }
                dVar.d(duration, "android.media.metadata.DURATION");
                long j10 = cVar.P().f253s;
                if (j10 != -1) {
                    List<MediaSession.QueueItem> queue = ((h) cVar.f156b).f275a.getQueue();
                    if (queue != null) {
                        arrayList = MediaSessionCompat$QueueItem.a(queue);
                    } else {
                        arrayList = null;
                    }
                    int i10 = 0;
                    while (true) {
                        if (arrayList == null || i10 >= arrayList.size()) {
                            break;
                        }
                        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) arrayList.get(i10);
                        if (mediaSessionCompat$QueueItem.f238b == j10) {
                            MediaDescriptionCompat mediaDescriptionCompat = mediaSessionCompat$QueueItem.f237a;
                            Bundle bundle = mediaDescriptionCompat.h;
                            if (bundle != null) {
                                for (String str2 : bundle.keySet()) {
                                    Object obj2 = bundle.get(str2);
                                    if (obj2 instanceof String) {
                                        dVar.e(w2.k(str, str2), (String) obj2);
                                    } else {
                                        boolean z10 = obj2 instanceof CharSequence;
                                        boolean z11 = true;
                                        Bundle bundle2 = dVar.f235a;
                                        if (z10) {
                                            String k10 = w2.k(str, str2);
                                            CharSequence charSequence = (CharSequence) obj2;
                                            f fVar = MediaMetadataCompat.d;
                                            if (fVar.containsKey(k10) && ((Integer) fVar.get(k10)).intValue() != 1) {
                                                throw new IllegalArgumentException(android.support.v4.media.a.o("The ", k10, " key cannot be used to put a CharSequence"));
                                            }
                                            bundle2.putCharSequence(k10, charSequence);
                                        } else if (obj2 instanceof Long) {
                                            dVar.d(((Long) obj2).longValue(), w2.k(str, str2));
                                        } else if (obj2 instanceof Integer) {
                                            dVar.d(((Integer) obj2).intValue(), w2.k(str, str2));
                                        } else if (obj2 instanceof Bitmap) {
                                            dVar.c(w2.k(str, str2), (Bitmap) obj2);
                                        } else if (obj2 instanceof RatingCompat) {
                                            String k11 = w2.k(str, str2);
                                            RatingCompat ratingCompat = (RatingCompat) obj2;
                                            float f10 = ratingCompat.f233b;
                                            int i11 = ratingCompat.f232a;
                                            f fVar2 = MediaMetadataCompat.d;
                                            if (fVar2.containsKey(k11) && ((Integer) fVar2.get(k11)).intValue() != 3) {
                                                throw new IllegalArgumentException(android.support.v4.media.a.o("The ", k11, " key cannot be used to put a Rating"));
                                            }
                                            if (ratingCompat.f234c == null) {
                                                if (ratingCompat.a()) {
                                                    switch (i11) {
                                                        case 1:
                                                            if (i11 != 1 || f10 != 1.0f) {
                                                                z11 = false;
                                                            }
                                                            ratingCompat.f234c = android.support.v4.media.e.g(z11);
                                                            break;
                                                        case 2:
                                                            if (i11 != 2 || f10 != 1.0f) {
                                                                z11 = false;
                                                            }
                                                            ratingCompat.f234c = android.support.v4.media.e.j(z11);
                                                            break;
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                            if ((i11 != 3 && i11 != 4 && i11 != 5) || !ratingCompat.a()) {
                                                                f10 = -1.0f;
                                                            }
                                                            ratingCompat.f234c = android.support.v4.media.e.i(i11, f10);
                                                            break;
                                                        case 6:
                                                            ratingCompat.f234c = android.support.v4.media.e.h((i11 == 6 && ratingCompat.a()) ? -1.0f : -1.0f);
                                                            break;
                                                        default:
                                                            obj = null;
                                                            break;
                                                    }
                                                    bundle2.putParcelable(k11, (Parcelable) obj);
                                                } else {
                                                    ratingCompat.f234c = android.support.v4.media.e.k(i11);
                                                }
                                            }
                                            obj = ratingCompat.f234c;
                                            bundle2.putParcelable(k11, (Parcelable) obj);
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence2 = mediaDescriptionCompat.f223b;
                            if (charSequence2 != null) {
                                String valueOf = String.valueOf(charSequence2);
                                dVar.e("android.media.metadata.TITLE", valueOf);
                                dVar.e("android.media.metadata.DISPLAY_TITLE", valueOf);
                            }
                            CharSequence charSequence3 = mediaDescriptionCompat.f224c;
                            if (charSequence3 != null) {
                                dVar.e("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequence3));
                            }
                            CharSequence charSequence4 = mediaDescriptionCompat.d;
                            if (charSequence4 != null) {
                                dVar.e("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequence4));
                            }
                            Bitmap bitmap = mediaDescriptionCompat.e;
                            if (bitmap != null) {
                                dVar.c("android.media.metadata.DISPLAY_ICON", bitmap);
                            }
                            Uri uri = mediaDescriptionCompat.f225f;
                            if (uri != null) {
                                dVar.e("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uri));
                            }
                            String str3 = mediaDescriptionCompat.f222a;
                            if (str3 != null) {
                                dVar.e("android.media.metadata.MEDIA_ID", str3);
                            }
                            Uri uri2 = mediaDescriptionCompat.f226n;
                            if (uri2 != null) {
                                dVar.e("android.media.metadata.MEDIA_URI", String.valueOf(uri2));
                            }
                        } else {
                            i10++;
                        }
                    }
                }
                mediaMetadataCompat = dVar.a();
            }
        }
        this.f42734a.e(mediaMetadataCompat);
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: q3.c.c():void");
    }

    public final void d(a2 a2Var) {
        boolean z4;
        if (a2Var != null && a2Var.A() != this.f42735b) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        a2 a2Var2 = this.f42739i;
        a aVar = this.f42736c;
        if (a2Var2 != null) {
            a2Var2.u(aVar);
        }
        this.f42739i = a2Var;
        if (a2Var != null) {
            a2Var.n(aVar);
        }
        c();
        b();
    }
}
