package sh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import c8.zc;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.n0;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public abstract class h {
    public static int a(ij ijVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i7;
        int i10 = 0;
        if (ijVar.D == 17) {
            TLRPC.Message message = ijVar.f23266k;
            int i11 = ijVar.I1;
            TLRPC.MessageMedia n1 = ij.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
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
                        B0 = ij.B0(ijVar.f23266k);
                    }
                    TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(-B0));
                    if (M0 != null) {
                        if (M0.left || M0.kicked) {
                            i10 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if (messageFwdHeader2 != null) {
                            i7 = messageFwdHeader2.date;
                        } else {
                            i7 = message.date;
                        }
                        if (i7 - M0.date < 86400) {
                            i10 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(((n0) qp.s1(i11).f24946x7.O.f13557b).f24122c)) {
                        return i10 | 4;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i7, ij ijVar) {
        TLRPC.MessageMedia messageMedia;
        long B0;
        int i10;
        int i11;
        if (ijVar.D == 17) {
            TLRPC.Message message = ijVar.f23266k;
            int i12 = ijVar.I1;
            TLRPC.MessageMedia n1 = ij.n1(message);
            if (TLRPC.TL_messageMediaPoll.class.isInstance(n1)) {
                messageMedia = (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1);
            } else {
                messageMedia = null;
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            if (tL_messageMediaPoll != null) {
                if (zc.a(i7, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        String str = arrayList2.get(i13);
                        i13++;
                        String str2 = str;
                        String i02 = id.i0(2131750521, str2);
                        if (!TextUtils.isEmpty(i02)) {
                            str2 = i02;
                        }
                        arrayList.add(str2);
                    }
                    boolean z9 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        if (z9) {
                            i11 = 2131747117;
                        } else {
                            i11 = 2131747114;
                        }
                        return g0.X2(id.a0(null, null, i11, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i14 = 0; i14 < arrayList.size() - 1; i14++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i14));
                    }
                    if (z9) {
                        i10 = 2131747116;
                    } else {
                        i10 = 2131747113;
                    }
                    return g0.X2(id.a0(null, null, i10, stringBuffer, jg.g.i(1, arrayList)));
                } else if (zc.a(i7, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    if (messageFwdHeader != null) {
                        B0 = m5.o(messageFwdHeader.from_id);
                    } else {
                        B0 = ij.B0(ijVar.f23266k);
                    }
                    return g0.X2(id.a0(null, null, 2131747118, m5.u(qp.s1(i12).M0(Long.valueOf(-B0)))));
                } else if (zc.a(i7, 2)) {
                    return g0.X2(id.M0(2131747115, null));
                }
            }
        }
        return null;
    }
}
