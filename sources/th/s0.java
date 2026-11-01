package th;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.uz;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class s0 implements vs, AudioManager.OnAudioFocusChangeListener {
    public static s0 W;
    public int D;
    public NativeInstance E;
    public TLRPC.GroupCallParticipant G;
    public final q0 H;
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
    public final TL_stories.StoryItem f49433a;
    public final long f49434b;
    public final int f49435c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f49436f;
    public final boolean h;
    public boolean f49437n;
    public TLRPC.GroupCall f49440w;
    public boolean f49442y;
    public boolean f49438r = false;
    public boolean f49439s = false;
    public boolean f49441x = false;
    public final HashMap F = new HashMap();
    public final HashSet M = new HashSet();
    public float N = 1.0f;
    public int S = -1;
    public int T = -1;

    public s0(Context context, int i10, TL_stories.StoryItem storyItem, long j10, int i11, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.I = false;
        this.d = context;
        this.e = i10;
        this.f49436f = inputGroupCall;
        this.f49433a = storyItem;
        this.f49434b = j10;
        this.f49435c = i11;
        this.h = z10;
        this.f49437n = z11;
        this.I = z12;
        q0 q0Var = new q0(this);
        this.H = q0Var;
        f8.b("[LivePlayer] setup to call " + inputGroupCall.f19811id);
        at.f(i10).b(this, at.f14816x2);
        if (z11) {
            this.J = NativeInstance.createVideoCapturer(q0Var, z12 ? 1 : 0);
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
        if (!this.f49441x && !this.f49437n && this.f49439s && W == null && (groupCall = this.f49440w) != null && !groupCall.rtmp_stream && groupCall.creator) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f49440w == null || l()) {
            return false;
        }
        return !this.f49440w.messages_enabled;
    }

    public final void c() {
        boolean z10;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.f49437n) {
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
        if (i10 == at.f14816x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.f49434b == longValue) {
                sf.d.a(this.f49440w, groupCall);
                this.f49440w = groupCall;
                at.f(this.e).k(at.G2, Long.valueOf(groupCall.f19804id));
            }
        }
    }

    public final void e() {
        if (!this.f49441x) {
            this.f49441x = true;
            u(false);
            at.f(this.e).n(this, at.f14816x2);
            f8.b("[LivePlayer] destroyed");
            if (this.f49442y) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f49436f;
                ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new l0(this, 5));
            }
            if (this.f49437n) {
                this.H.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.J);
            }
            if (this.E != null) {
                org.telegram.messenger.r5 r5Var = Utilities.e;
                NativeInstance nativeInstance = this.E;
                Objects.requireNonNull(nativeInstance);
                r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance, 3));
                this.M.clear();
                this.E = null;
            }
            if (this.L) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.L = false;
            }
            if (this.f49437n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (W == this) {
                W = null;
                at.f(this.e).k(at.G2, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f49436f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f19811id != inputGroupCall.f19811id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.f49440w;
        if (groupCall != null) {
            return groupCall.f19804id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f49436f;
        if (inputGroupCall != null) {
            return inputGroupCall.f19811id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.f49440w;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.f49440w;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.f49440w;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.f49441x) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.n1.d("live_" + this.f49436f.f19811id), 0L, false, uz.I0, new k0(this, 0), new rh.x6(24), new k0(this, 2), new k0(this, 3), new k0(this, 4), new k0(this, 5), false);
        this.E = makeGroup;
        makeGroup.setOnStateUpdatedListener(new r0(this));
        this.E.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.f49440w;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j10 = this.f49434b;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.e;
        if (i10 >= 0) {
            if (e20.i(i11).e() == j10) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.w3.w(14, wp.r1(i11).L0(Long.valueOf(-j10)));
    }

    public final boolean m() {
        int i10 = this.D;
        if (i10 == 3 || i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f49441x && this.f49439s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f49437n && this.f49438r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.Q = null;
        if (this.f49441x) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f49436f;
        checkgroupcall.sources.add(Integer.valueOf(this.K));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new l0(this, 3));
    }

    public final void q() {
        this.R = null;
        if (this.f49441x) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f49436f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new l0(this, 1));
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
        if (!this.f49441x && this.f49439s != z10) {
            if (this.f49437n && z10) {
                return;
            }
            this.f49439s = z10;
            at.f(this.e).k(at.G2, Long.valueOf(g()));
        }
    }

    public final void u(boolean z10) {
        int i10;
        if (this.f49441x) {
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
                    org.telegram.messenger.i0.r(runnable);
                    this.Q = null;
                }
                Runnable runnable2 = this.R;
                if (runnable2 != null) {
                    org.telegram.messenger.i0.r(runnable2);
                    this.R = null;
                    return;
                }
                return;
            }
            Runnable runnable3 = this.Q;
            if (runnable3 != null) {
                org.telegram.messenger.i0.r(runnable3);
            }
            n0 n0Var = new n0(this, 0);
            this.Q = n0Var;
            org.telegram.messenger.i0.h3(n0Var, 4000L);
            Runnable runnable4 = this.R;
            if (runnable4 != null) {
                org.telegram.messenger.i0.r(runnable4);
            }
            n0 n0Var2 = new n0(this, 1);
            this.R = n0Var2;
            if (l()) {
                i10 = 5000;
            } else {
                i10 = 20000;
            }
            org.telegram.messenger.i0.h3(n0Var2, i10);
        }
    }

    public final void v(float f7) {
        float l4 = Utilities.l(f7);
        w0 w0Var = w0.Z;
        if (w0Var.S && w0Var.f49570w == this) {
            l4 = 1.0f;
        }
        f8.b("setVolume(" + l4 + ")");
        if (Math.abs(l4 - this.N) < 0.01f) {
            return;
        }
        this.N = l4;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i10 = this.e;
        tL_updateStory.peer = wp.r1(i10).y1(this.f49434b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f20032id = this.f49435c;
        wp.r1(i10).O1().c0(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f49441x && this.E != null) {
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
