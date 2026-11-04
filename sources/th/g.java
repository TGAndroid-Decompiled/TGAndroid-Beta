package th;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.n0;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import x7.u;
public abstract class g {
    public static int a(zi ziVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i3;
        int i10 = 0;
        if (ziVar.D == 17) {
            TLRPC.Message message = ziVar.f26868k;
            int i11 = ziVar.I1;
            TLRPC.MessageMedia o12 = zi.o1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(o12)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                if (poll.closed) {
                    i10 = 8;
                }
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = m5.o(messageFwdHeader.from_id);
                    } else {
                        B0 = zi.B0(ziVar.f26868k);
                    }
                    TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-B0));
                    if (M0 != null) {
                        if (M0.left || M0.kicked) {
                            i10 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if (messageFwdHeader2 != null) {
                            i3 = messageFwdHeader2.date;
                        } else {
                            i3 = message.date;
                        }
                        if (i3 - M0.date < 86400) {
                            i10 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(((n0) hp.s1(i11).f23167x7.O.f13798b).f24297c)) {
                        return i10 | 4;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i3, zi ziVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i10;
        int i11;
        if (ziVar.D == 17) {
            TLRPC.Message message = ziVar.f26868k;
            int i12 = ziVar.I1;
            TLRPC.MessageMedia o12 = zi.o1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(o12)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                if (u.a(i3, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        String str = arrayList2.get(i13);
                        i13++;
                        String str2 = str;
                        String i02 = bd.i0(2131750529, str2);
                        if (!TextUtils.isEmpty(i02)) {
                            str2 = i02;
                        }
                        arrayList.add(str2);
                    }
                    boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z10) {
                            i11 = 2131747125;
                        } else {
                            i11 = 2131747122;
                        }
                        return g0.X2(bd.a0(null, null, i11, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i14 = 0; i14 < arrayList.size() - 1; i14++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i14));
                    }
                    if (z10) {
                        i10 = 2131747124;
                    } else {
                        i10 = 2131747121;
                    }
                    return g0.X2(bd.a0(null, null, i10, stringBuffer, p1.h(1, arrayList)));
                } else if (u.a(i3, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = m5.o(messageFwdHeader.from_id);
                    } else {
                        B0 = zi.B0(ziVar.f26868k);
                    }
                    return g0.X2(bd.a0(null, null, 2131747126, m5.u(hp.s1(i12).M0(Long.valueOf(-B0)))));
                } else if (u.a(i3, 2)) {
                    return g0.X2(bd.M0(2131747123, null));
                }
            }
        }
        return null;
    }
}
