package q3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.s;
import cb.e;
import h5.g;
import i5.y;
import j3.a2;
import j3.c1;
import j3.e1;
import j3.o2;
import j3.q2;
import j3.t1;
import j3.v1;
import j3.w1;
import j3.x1;
import j3.y1;
import j3.z1;
import java.util.ArrayList;
import java.util.List;
import l3.d;
public final class a extends s implements y1 {
    public int f44472a;
    public int f44473b;
    public final c f44474c;

    public a(c cVar) {
        this.f44474c = cVar;
    }

    @Override
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f44474c.getClass();
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        c cVar = this.f44474c;
        ArrayList arrayList = cVar.f44479e;
        ArrayList arrayList2 = cVar.d;
        if (cVar.f44482i != null) {
            if (arrayList2.size() <= 0) {
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
                return;
            }
            arrayList2.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        c cVar = this.f44474c;
        if (cVar.f44482i != null && cVar.f44481g.containsKey(str)) {
            cVar.f44481g.get(str).getClass();
            throw new ClassCastException();
        }
    }

    @Override
    public final void onEvents(a2 a2Var, x1 x1Var) {
        boolean z4;
        boolean z10;
        g gVar = x1Var.f9481a;
        boolean z11 = true;
        if (gVar.f7257a.get(11)) {
            if (this.f44472a != a2Var.x()) {
                z4 = true;
            } else {
                z4 = false;
            }
            z10 = true;
        } else {
            z4 = false;
            z10 = false;
        }
        if (gVar.f7257a.get(0)) {
            int o10 = a2Var.z().o();
            z10 = (this.f44473b == o10 && this.f44472a == a2Var.x()) ? true : true;
            this.f44473b = o10;
            z4 = true;
        }
        this.f44472a = a2Var.x();
        int[] iArr = {4, 5, 7, 8, 12};
        int i10 = 0;
        while (true) {
            if (i10 >= 5) {
                break;
            }
            if (gVar.f7257a.get(iArr[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!gVar.f7257a.get(new int[]{9}[0])) {
            z11 = z10;
        }
        c cVar = this.f44474c;
        if (z11) {
            cVar.c();
        }
        if (z4) {
            cVar.b();
        }
    }

    @Override
    public final void onFastForward() {
        c cVar = this.f44474c;
        if (c.a(cVar, 64L)) {
            e eVar = (e) cVar.f44482i;
            long C = eVar.C() + eVar.q();
            long duration = eVar.getDuration();
            if (duration != -9223372036854775807L) {
                C = Math.min(C, duration);
            }
            eVar.K(eVar.x(), 12, Math.max(C, 0L));
        }
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        this.f44474c.getClass();
        if (super.onMediaButtonEvent(intent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onPause() {
        c cVar = this.f44474c;
        if (c.a(cVar, 2L)) {
            ((e) cVar.f44482i).p(false);
        }
    }

    @Override
    public final void onPlay() {
        c cVar = this.f44474c;
        if (c.a(cVar, 4L)) {
            if (cVar.f44482i.b() == 1) {
                cVar.f44482i.a();
            } else if (cVar.f44482i.b() == 4) {
                a2 a2Var = cVar.f44482i;
                ((e) a2Var).K(a2Var.x(), 10, -9223372036854775807L);
            }
            a2 a2Var2 = cVar.f44482i;
            a2Var2.getClass();
            ((e) a2Var2).p(true);
        }
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        this.f44474c.getClass();
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        this.f44474c.getClass();
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        this.f44474c.getClass();
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onPrepare() {
        this.f44474c.getClass();
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        this.f44474c.getClass();
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        this.f44474c.getClass();
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        this.f44474c.getClass();
    }

    @Override
    public final void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f44474c.getClass();
    }

    @Override
    public final void onRewind() {
        c cVar = this.f44474c;
        if (c.a(cVar, 8L)) {
            e eVar = (e) cVar.f44482i;
            long C = eVar.C() + (-eVar.D());
            long duration = eVar.getDuration();
            if (duration != -9223372036854775807L) {
                C = Math.min(C, duration);
            }
            eVar.K(eVar.x(), 11, Math.max(C, 0L));
        }
    }

    @Override
    public final void onSeekTo(long j10) {
        c cVar = this.f44474c;
        if (c.a(cVar, 256L)) {
            a2 a2Var = cVar.f44482i;
            ((e) a2Var).K(a2Var.x(), 10, j10);
        }
    }

    @Override
    public final void onSetCaptioningEnabled(boolean z4) {
        this.f44474c.getClass();
    }

    @Override
    public final void onSetPlaybackSpeed(float f10) {
        c cVar = this.f44474c;
        if (c.a(cVar, 4194304L) && f10 > 0.0f) {
            a2 a2Var = cVar.f44482i;
            a2Var.c(new v1(f10, a2Var.d().f9453b));
        }
    }

    @Override
    public final void onSetRating(RatingCompat ratingCompat) {
        this.f44474c.getClass();
    }

    @Override
    public final void onSetRepeatMode(int i10) {
        c cVar = this.f44474c;
        if (c.a(cVar, 262144L)) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2 && i10 != 3) {
                    i11 = 0;
                }
            }
            cVar.f44482i.e(i11);
        }
    }

    @Override
    public final void onSetShuffleMode(int i10) {
        c cVar = this.f44474c;
        if (c.a(cVar, 2097152L)) {
            boolean z4 = true;
            if (i10 != 1 && i10 != 2) {
                z4 = false;
            }
            cVar.f44482i.k(z4);
        }
    }

    @Override
    public final void onSkipToNext() {
        this.f44474c.getClass();
    }

    @Override
    public final void onSkipToPrevious() {
        this.f44474c.getClass();
    }

    @Override
    public final void onSkipToQueueItem(long j10) {
        this.f44474c.getClass();
    }

    @Override
    public final void onStop() {
        c cVar = this.f44474c;
        if (c.a(cVar, 1L)) {
            cVar.f44482i.stop();
            if (cVar.f44484k) {
                ((e) cVar.f44482i).l();
            }
        }
    }

    @Override
    public final void onCues(v4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(z1 z1Var, z1 z1Var2, int i10) {
    }

    @Override
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        this.f44474c.getClass();
    }

    @Override
    public final void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        this.f44474c.getClass();
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void onAudioAttributesChanged(d dVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(w1 w1Var) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z4) {
    }

    @Override
    public final void onIsPlayingChanged(boolean z4) {
    }

    @Override
    public final void onLoadingChanged(boolean z4) {
    }

    @Override
    public final void onMediaMetadataChanged(e1 e1Var) {
    }

    @Override
    public final void onMetadata(e4.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(v1 v1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerError(t1 t1Var) {
    }

    @Override
    public final void onPlayerErrorChanged(t1 t1Var) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override
    public final void onTracksChanged(q2 q2Var) {
    }

    @Override
    public final void onVideoSizeChanged(y yVar) {
    }

    @Override
    public final void onVolumeChanged(float f10) {
    }

    @Override
    public final void onMediaItemTransition(c1 c1Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z4, int i10) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z4, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(o2 o2Var, int i10) {
    }
}
