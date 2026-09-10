package zh;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class t0 implements NotificationCenter.NotificationCenterDelegate, AudioManager.OnAudioFocusChangeListener {
    public static t0 W;
    public NativeInstance E;
    public TLRPC.GroupCallParticipant G;
    public final r0 H;
    public boolean I;
    public long J;
    public int K;
    public boolean L;
    public VideoSink O;
    public boolean P;
    public Runnable Q;
    public Runnable R;
    public ArrayList U;
    public ArrayList V;
    public final TL_stories.StoryItem f48878a;
    public final long f48879b;
    public final int f48880c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f48881f;
    public final boolean h;
    public boolean f48882n;
    public TLRPC.GroupCall v;
    public boolean f48886x;
    public int f48887y;
    public boolean f48883r = false;
    public boolean f48884s = false;
    public boolean f48885w = false;
    public final HashMap F = new HashMap();
    public final HashSet M = new HashSet();
    public float N = 1.0f;
    public int S = -1;
    public int T = -1;

    public t0(Context context, int i10, TL_stories.StoryItem storyItem, long j3, int i11, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.I = false;
        this.d = context;
        this.e = i10;
        this.f48881f = inputGroupCall;
        this.f48878a = storyItem;
        this.f48879b = j3;
        this.f48880c = i11;
        this.h = z10;
        this.f48882n = z11;
        this.I = z12;
        r0 r0Var = new r0(this);
        this.H = r0Var;
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.f17212id);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z11) {
            this.J = NativeInstance.createVideoCapturer(r0Var, z12 ? 1 : 0);
        }
        c();
        k();
    }

    public static NativeInstance.SsrcGroup[] d(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i10 = 0; i10 < size; i10++) {
            ssrcGroupArr[i10] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i10);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i10];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i11 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i10].ssrcs;
                if (i11 < iArr.length) {
                    iArr[i11] = tL_groupCallParticipantVideoSourceGroup.sources.get(i11).intValue();
                    i11++;
                }
            }
        }
        return ssrcGroupArr;
    }

    public final boolean a() {
        TLRPC.GroupCall groupCall;
        if (!this.f48885w && !this.f48882n && this.f48884s && W == null && (groupCall = this.v) != null && !groupCall.rtmp_stream && groupCall.creator) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.v == null || l()) {
            return false;
        }
        return !this.v.messages_enabled;
    }

    public final void c() {
        boolean z10;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.f48882n) {
            audioManager.setMode(3);
            if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyGroupCallUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.f48879b == longValue) {
                yf.d.a(this.v, groupCall);
                this.v = groupCall;
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.f17205id));
            }
        }
    }

    public final void e() {
        if (!this.f48885w) {
            this.f48885w = true;
            u(false);
            NotificationCenter.getInstance(this.e).removeObserver(this, NotificationCenter.storyGroupCallUpdated);
            FileLog.d("[LivePlayer] destroyed");
            if (this.f48886x) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f48881f;
                ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new o0(this, 5));
            }
            if (this.f48882n) {
                this.H.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.J);
            }
            if (this.E != null) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                NativeInstance nativeInstance = this.E;
                Objects.requireNonNull(nativeInstance);
                dispatchQueue.postRunnable(new org.telegram.messenger.voip.u0(nativeInstance, 3));
                this.M.clear();
                this.E = null;
            }
            if (this.L) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.L = false;
            }
            if (this.f48882n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (W == this) {
                W = null;
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f48881f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f17212id != inputGroupCall.f17212id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null) {
            return groupCall.f17205id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f48881f;
        if (inputGroupCall != null) {
            return inputGroupCall.f17212id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.f48885w) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.e2.d("live_" + this.f48881f.f17212id), 0L, false, SharedConfig.noiseSupression, new n0(this, 0), new z9.a(8), new n0(this, 2), new n0(this, 3), new n0(this, 4), new n0(this, 5), false);
        this.E = makeGroup;
        makeGroup.setOnStateUpdatedListener(new s0(this));
        this.E.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        int i10 = this.e;
        long j3 = this.f48879b;
        if (j3 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j3) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 14);
    }

    public final boolean m() {
        int i10 = this.f48887y;
        if (i10 == 3 || i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f48885w && this.f48884s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f48882n && this.f48883r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.Q = null;
        if (this.f48885w) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f48881f;
        checkgroupcall.sources.add(Integer.valueOf(this.K));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new o0(this, 3));
    }

    public final void q() {
        this.R = null;
        if (this.f48885w) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f48881f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new o0(this, 1));
    }

    public final void r(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int length;
        int i10 = 0;
        while (true) {
            if (ssrcGroupArr == null) {
                length = 0;
            } else {
                length = ssrcGroupArr.length;
            }
            if (i10 < length) {
                int i11 = 0;
                while (true) {
                    int[] iArr = ssrcGroupArr[i10].ssrcs;
                    if (i11 < iArr.length) {
                        this.M.add(Integer.valueOf(iArr[i11]));
                        i11++;
                    }
                }
                i10++;
            } else {
                x();
                return;
            }
        }
    }

    public final void s(VideoSink videoSink) {
        if (this.O == videoSink) {
            return;
        }
        this.O = videoSink;
        this.H.setTarget(videoSink);
    }

    public final void t(boolean z10) {
        if (!this.f48885w && this.f48884s != z10) {
            if (this.f48882n && z10) {
                return;
            }
            this.f48884s = z10;
            NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
        }
    }

    public final void u(boolean z10) {
        int i10;
        if (this.f48885w) {
            z10 = false;
        }
        if (this.P != z10) {
            this.P = z10;
            if (!z10) {
                int i11 = this.S;
                int i12 = this.e;
                if (i11 != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.S, true);
                    this.S = -1;
                }
                if (this.T != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.T, true);
                    this.T = -1;
                }
                Runnable runnable = this.Q;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.Q = null;
                }
                Runnable runnable2 = this.R;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.R = null;
                    return;
                }
                return;
            }
            Runnable runnable3 = this.Q;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
            }
            bi.c5 c5Var = new bi.c5(this, 1);
            this.Q = c5Var;
            AndroidUtilities.runOnUIThread(c5Var, 4000L);
            Runnable runnable4 = this.R;
            if (runnable4 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable4);
            }
            bi.c5 c5Var2 = new bi.c5(this, 2);
            this.R = c5Var2;
            if (l()) {
                i10 = 5000;
            } else {
                i10 = 20000;
            }
            AndroidUtilities.runOnUIThread(c5Var2, i10);
        }
    }

    public final void v(float f7) {
        float clamp01 = Utilities.clamp01(f7);
        x0 x0Var = x0.Z;
        if (x0Var.S && x0Var.v == this) {
            clamp01 = 1.0f;
        }
        FileLog.d("setVolume(" + clamp01 + ")");
        if (Math.abs(clamp01 - this.N) < 0.01f) {
            return;
        }
        this.N = clamp01;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i10 = this.e;
        tL_updateStory.peer = MessagesController.getInstance(i10).getPeer(this.f48879b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f17435id = this.f48880c;
        MessagesController.getInstance(i10).getStoriesController().Z(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f48885w && this.E != null) {
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                this.E.setVolume(((Integer) it.next()).intValue(), this.N);
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
    }
}
