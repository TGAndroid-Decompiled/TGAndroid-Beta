package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f47861a;
    public final long f47862b;
    public final List f47863c;

    public d(long j10, long j11, List list) {
        this.f47861a = j10;
        this.f47862b = j11;
        this.f47863c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f47861a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.q(sb2, this.f47862b, " }");
    }
}
