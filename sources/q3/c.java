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
import o5.i;
public final class c {
    public static final MediaMetadataCompat f44444l;
    public final c0 f44445a;
    public final Looper f44446b;
    public final a f44447c;
    public final ArrayList d;
    public final ArrayList f44448e;
    public final b[] f44449f;
    public Map f44450g;
    public final qa h;
    public a2 f44451i;
    public final long f44452j;
    public final boolean f44453k;

    static {
        l0.a("goog.exo.mediasession");
        f44444l = new MediaMetadataCompat(new Bundle());
    }

    public c(c0 c0Var) {
        this.f44445a = c0Var;
        int i10 = d0.f7237a;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f44446b = myLooper;
        a aVar = new a(this);
        this.f44447c = aVar;
        this.d = new ArrayList();
        this.f44448e = new ArrayList();
        this.f44449f = new b[0];
        this.f44450g = Collections.EMPTY_MAP;
        this.h = new qa(c0Var.f280b);
        this.f44452j = 2360143L;
        c0Var.f279a.f303a.setFlags(3);
        c0Var.d(aVar, new Handler(myLooper));
        this.f44453k = true;
    }

    public static boolean a(c cVar, long j10) {
        if (cVar.f44451i != null && (j10 & cVar.f44452j) != 0) {
            return true;
        }
        return false;
    }

    public final void b() {
        a2 a2Var;
        long duration;
        ArrayList arrayList;
        Object obj;
        MediaMetadataCompat mediaMetadataCompat = f44444l;
        qa qaVar = this.h;
        if (qaVar != null && (a2Var = this.f44451i) != null) {
            bf.b bVar = (bf.b) qaVar.f15699b;
            String str = (String) qaVar.f15700c;
            if (!a2Var.z().p()) {
                i iVar = new i(1);
                Bundle bundle = (Bundle) iVar.f16615b;
                if (a2Var.f()) {
                    iVar.x(1L, "android.media.metadata.ADVERTISEMENT");
                }
                e eVar = (e) a2Var;
                o2 z4 = eVar.z();
                if ((!z4.p() && z4.m(eVar.x(), (n2) eVar.f2406a, 0L).f9340r) || a2Var.getDuration() == -9223372036854775807L) {
                    duration = -1;
                } else {
                    duration = a2Var.getDuration();
                }
                iVar.x(duration, "android.media.metadata.DURATION");
                long j10 = bVar.P().f270s;
                if (j10 != -1) {
                    List<MediaSession.QueueItem> queue = ((h) bVar.f1935b).f294a.getQueue();
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
                        if (mediaSessionCompat$QueueItem.f253b == j10) {
                            MediaDescriptionCompat mediaDescriptionCompat = mediaSessionCompat$QueueItem.f252a;
                            Bundle bundle2 = mediaDescriptionCompat.h;
                            if (bundle2 != null) {
                                for (String str2 : bundle2.keySet()) {
                                    Object obj2 = bundle2.get(str2);
                                    if (obj2 instanceof String) {
                                        iVar.A(w.c.e(str, str2), (String) obj2);
                                    } else {
                                        boolean z10 = true;
                                        if (obj2 instanceof CharSequence) {
                                            String e6 = w.c.e(str, str2);
                                            CharSequence charSequence = (CharSequence) obj2;
                                            f fVar = MediaMetadataCompat.d;
                                            if (fVar.containsKey(e6) && ((Integer) fVar.get(e6)).intValue() != 1) {
                                                throw new IllegalArgumentException(android.support.v4.media.a.o("The ", e6, " key cannot be used to put a CharSequence"));
                                            }
                                            bundle.putCharSequence(e6, charSequence);
                                        } else if (obj2 instanceof Long) {
                                            iVar.x(((Long) obj2).longValue(), w.c.e(str, str2));
                                        } else if (obj2 instanceof Integer) {
                                            iVar.x(((Integer) obj2).intValue(), w.c.e(str, str2));
                                        } else if (obj2 instanceof Bitmap) {
                                            iVar.w(w.c.e(str, str2), (Bitmap) obj2);
                                        } else if (obj2 instanceof RatingCompat) {
                                            String e10 = w.c.e(str, str2);
                                            RatingCompat ratingCompat = (RatingCompat) obj2;
                                            float f10 = ratingCompat.f249b;
                                            int i11 = ratingCompat.f248a;
                                            f fVar2 = MediaMetadataCompat.d;
                                            if (fVar2.containsKey(e10) && ((Integer) fVar2.get(e10)).intValue() != 3) {
                                                throw new IllegalArgumentException(android.support.v4.media.a.o("The ", e10, " key cannot be used to put a Rating"));
                                            }
                                            if (ratingCompat.f250c == null) {
                                                if (ratingCompat.a()) {
                                                    switch (i11) {
                                                        case 1:
                                                            if (i11 != 1 || f10 != 1.0f) {
                                                                z10 = false;
                                                            }
                                                            ratingCompat.f250c = d.g(z10);
                                                            break;
                                                        case 2:
                                                            if (i11 != 2 || f10 != 1.0f) {
                                                                z10 = false;
                                                            }
                                                            ratingCompat.f250c = d.j(z10);
                                                            break;
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                            if ((i11 != 3 && i11 != 4 && i11 != 5) || !ratingCompat.a()) {
                                                                f10 = -1.0f;
                                                            }
                                                            ratingCompat.f250c = d.i(i11, f10);
                                                            break;
                                                        case 6:
                                                            ratingCompat.f250c = d.h((i11 == 6 && ratingCompat.a()) ? -1.0f : -1.0f);
                                                            break;
                                                        default:
                                                            obj = null;
                                                            break;
                                                    }
                                                    bundle.putParcelable(e10, (Parcelable) obj);
                                                } else {
                                                    ratingCompat.f250c = d.k(i11);
                                                }
                                            }
                                            obj = ratingCompat.f250c;
                                            bundle.putParcelable(e10, (Parcelable) obj);
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence2 = mediaDescriptionCompat.f237b;
                            if (charSequence2 != null) {
                                String valueOf = String.valueOf(charSequence2);
                                iVar.A("android.media.metadata.TITLE", valueOf);
                                iVar.A("android.media.metadata.DISPLAY_TITLE", valueOf);
                            }
                            CharSequence charSequence3 = mediaDescriptionCompat.f238c;
                            if (charSequence3 != null) {
                                iVar.A("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequence3));
                            }
                            CharSequence charSequence4 = mediaDescriptionCompat.d;
                            if (charSequence4 != null) {
                                iVar.A("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequence4));
                            }
                            Bitmap bitmap = mediaDescriptionCompat.f239e;
                            if (bitmap != null) {
                                iVar.w("android.media.metadata.DISPLAY_ICON", bitmap);
                            }
                            Uri uri = mediaDescriptionCompat.f240f;
                            if (uri != null) {
                                iVar.A("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uri));
                            }
                            String str3 = mediaDescriptionCompat.f236a;
                            if (str3 != null) {
                                iVar.A("android.media.metadata.MEDIA_ID", str3);
                            }
                            Uri uri2 = mediaDescriptionCompat.f241n;
                            if (uri2 != null) {
                                iVar.A("android.media.metadata.MEDIA_URI", String.valueOf(uri2));
                            }
                        } else {
                            i10++;
                        }
                    }
                }
                mediaMetadataCompat = iVar.b();
            }
        }
        this.f44445a.e(mediaMetadataCompat);
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: q3.c.c():void");
    }

    public final void d(a2 a2Var) {
        boolean z4;
        if (a2Var != null && a2Var.A() != this.f44446b) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        a2 a2Var2 = this.f44451i;
        a aVar = this.f44447c;
        if (a2Var2 != null) {
            a2Var2.u(aVar);
        }
        this.f44451i = a2Var;
        if (a2Var != null) {
            a2Var.n(aVar);
        }
        c();
        b();
    }
}
