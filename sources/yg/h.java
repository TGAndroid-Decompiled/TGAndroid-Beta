package yg;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h {
    public final f f50238a;
    public final TLRPC.TL_messageMediaPoll f50239b;
    public final TLRPC.TL_inputMediaPoll f50240c;
    public final long d;
    public final String f50241e;
    public final ArrayList f50242f;

    public h(f fVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f50238a = fVar;
        this.d = j10;
        this.f50241e = str;
        this.f50242f = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.f22406id = poll.f22406id;
        tL_poll.flags = poll.flags;
        tL_poll.closed = poll.closed;
        tL_poll.public_voters = poll.public_voters;
        tL_poll.multiple_choice = poll.multiple_choice;
        tL_poll.open_answers = poll.open_answers;
        tL_poll.revoting_disabled = poll.revoting_disabled;
        tL_poll.shuffle_answers = poll.shuffle_answers;
        tL_poll.subscribers_only = poll.subscribers_only;
        tL_poll.countries_iso2 = poll.countries_iso2;
        tL_poll.hide_results_until_close = poll.hide_results_until_close;
        tL_poll.creator = poll.creator;
        tL_poll.quiz = poll.quiz;
        tL_poll.answers = new ArrayList<>(tL_messageMediaPoll.poll.answers);
        ArrayList<TLRPC.PollAnswer> arrayList3 = tL_messageMediaPoll.poll.answers;
        int size = arrayList3.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.PollAnswer pollAnswer = arrayList3.get(i9);
            i9++;
            new TLRPC.TL_inputPollAnswer().text = pollAnswer.text;
        }
        TLRPC.Poll poll2 = tL_inputMediaPoll.poll;
        TLRPC.Poll poll3 = tL_messageMediaPoll.poll;
        poll2.question = poll3.question;
        poll2.close_period = poll3.close_period;
        poll2.close_date = poll3.close_date;
        poll2.hash = poll3.hash;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_inputMediaPoll.solution = pollResults2.solution;
            tL_inputMediaPoll.solution_entities = pollResults2.solution_entities;
            tL_inputMediaPoll.flags |= 2;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            tL_inputMediaPoll.correct_answers = new ArrayList<>(arrayList2);
            tL_inputMediaPoll.flags |= 1;
        }
        if (fVar != null) {
            SparseArray sparseArray = fVar.f50223a;
            int size2 = sparseArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                e eVar = (e) sparseArray.valueAt(i10);
                if (eVar instanceof zg.e) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((zg.e) eVar).f50832b;
                    tL_inputMediaWebPage.optional = true;
                    f.k(tL_inputMediaPoll, keyAt, tL_inputMediaWebPage);
                } else if (eVar instanceof zg.f) {
                    f.k(tL_inputMediaPoll, keyAt, gf.d.h(((zg.f) eVar).f50839b));
                } else if (eVar instanceof zg.h) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((zg.h) eVar).f50842b;
                    tL_inputDocument.f22392id = document.f22386id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f22441id = tL_inputDocument;
                    f.k(tL_inputMediaPoll, keyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i11 = 0; i11 < size3; i11++) {
                int keyAt2 = sparseArray.keyAt(i11);
                e eVar2 = (e) sparseArray.valueAt(i11);
                if (eVar2 instanceof zg.e) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((zg.e) eVar2).f50832b;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    f.l(tL_messageMediaPoll, keyAt2, tL_messageMediaWebPage);
                } else if (eVar2 instanceof zg.f) {
                    f.l(tL_messageMediaPoll, keyAt2, ((zg.f) eVar2).f50839b);
                } else if (eVar2 instanceof zg.h) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((zg.h) eVar2).f50842b;
                    f.l(tL_messageMediaPoll, keyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.f50239b = tL_messageMediaPoll;
        this.f50240c = tL_inputMediaPoll;
    }
}
