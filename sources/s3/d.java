package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f45880a;
    public final long f45881b;
    public final List f45882c;

    public d(long j10, long j11, List list) {
        this.f45880a = j10;
        this.f45881b = j11;
        this.f45882c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f45880a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f45881b, " }");
    }
}
