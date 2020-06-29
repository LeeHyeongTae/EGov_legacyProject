<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main class="v-content" data-booted="true"
	style="padding: 64px 0px 612px 256px;">
<div class="v-content__wrap">
	<div data-v-6a79bb7f="" class="container">
		<a data-v-6a79bb7f="">DB에 있는 정보수 : 0</a>
		<div data-v-6a79bb7f="" class="v-card v-sheet theme--light">
			<div data-v-6a79bb7f="" class="v-card__title">
				All of Bicycle
				<div data-v-6a79bb7f="" class="spacer"></div>
				<div data-v-6a79bb7f=""
					class="v-input v-input--hide-details theme--light v-text-field v-text-field--single-line v-text-field--is-booted">
					<div class="v-input__control">
						<div class="v-input__slot">
							<div class="v-text-field__slot">
								<label for="input-115" class="v-label theme--light"
									style="left: 0px; right: auto; position: absolute;">Search</label><input
									id="input-115" type="text">
							</div>
							<div class="v-input__append-inner">
								<div class="v-input__icon v-input__icon--append">
									<i aria-hidden="true"
										class="v-icon notranslate mdi mdi-magnify theme--light"></i>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div data-v-6a79bb7f="" class="v-data-table theme--light">
				<div class="v-data-table__wrapper">
					<table>
						<colgroup>
							<col class="">
							<col class="">
							<col class="">
							<col class="">
							<col class="">
							<col class="">
							<col class="">
						</colgroup>
						<thead class="v-data-table-header">
							<tr>
								<th role="columnheader" scope="col"
									aria-label="bicycleSeq: Not sorted. Activate to sort ascending."
									aria-sort="none" class="text-start sortable"><span>bicycleSeq</span><i
									aria-hidden="true"
									class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
									style="font-size: 18px;"></i></th>
								<th role="columnheader" scope="col"
									aria-label="image: Not sorted. Activate to sort ascending."
									aria-sort="none" class="text-start sortable"><span>image</span><i
									aria-hidden="true"
									class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
									style="font-size: 18px;"></i></th>
								<th role="columnheader" scope="col"
									aria-label="name: Not sorted. Activate to sort ascending."
									aria-sort="none" class="text-start sortable"><span>name</span><i
									aria-hidden="true"
									class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
									style="font-size: 18px;"></i></th>
								<th role="columnheader" scope="col"
									aria-label="manufacturer: Not sorted. Activate to sort ascending."
									aria-sort="none" class="text-start sortable"><span>manufacturer</span><i
									aria-hidden="true"
									class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
									style="font-size: 18px;"></i></th>
								<th role="columnheader" scope="col"
									aria-label="kind: Not sorted. Activate to sort ascending."
									aria-sort="none" class="text-start sortable"><span>kind</span><i
									aria-hidden="true"
									class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
									style="font-size: 18px;"></i></th>
								<th role="columnheader" scope="col"
									aria-label="price: Not sorted. Activate to sort ascending."
									aria-sort="none" class="text-start sortable"><span>price</span><i
									aria-hidden="true"
									class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
									style="font-size: 18px;"></i></th>
								<th role="columnheader" scope="col"
									aria-label="year: Not sorted. Activate to sort ascending."
									aria-sort="none" class="text-start sortable"><span>year</span><i
									aria-hidden="true"
									class="v-icon notranslate v-data-table-header__icon mdi mdi-arrow-up theme--light"
									style="font-size: 18px;"></i></th>
							</tr>
						</thead>
						<tbody>
							<tr class="v-data-table__empty-wrapper">
								<td colspan="7">No data available</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="v-data-footer">
					<div class="v-data-footer__select">
						Rows per page:
						<div
							class="v-input v-input--hide-details v-input--is-label-active v-input--is-dirty theme--light v-text-field v-text-field--is-booted v-select">
							<div class="v-input__control">
								<div role="button" aria-haspopup="listbox" aria-expanded="false"
									aria-owns="list-129" class="v-input__slot">
									<div class="v-select__slot">
										<div class="v-select__selections">
											<div class="v-select__selection v-select__selection--comma">10</div>
											<input aria-label="$vuetify.dataTable.itemsPerPageText"
												id="input-129" type="text" readonly="readonly"
												aria-readonly="false" autocomplete="off">
										</div>
										<div class="v-input__append-inner">
											<div class="v-input__icon v-input__icon--append">
												<i aria-hidden="true"
													class="v-icon notranslate mdi mdi-menu-down theme--light"></i>
											</div>
										</div>
										<input type="hidden" value="10">
									</div>
									<div class="v-menu">
										<!---->
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="v-data-footer__pagination">–</div>
					<div class="v-data-footer__icons-before">
						<button type="button" disabled="disabled"
							class="v-btn v-btn--disabled v-btn--flat v-btn--icon v-btn--round v-btn--text theme--light v-size--default"
							aria-label="Previous page">
							<span class="v-btn__content"><i aria-hidden="true"
								class="v-icon notranslate mdi mdi-chevron-left theme--light"></i></span>
						</button>
					</div>
					<div class="v-data-footer__icons-after">
						<button type="button" disabled="disabled"
							class="v-btn v-btn--disabled v-btn--flat v-btn--icon v-btn--round v-btn--text theme--light v-size--default"
							aria-label="Next page">
							<span class="v-btn__content"><i aria-hidden="true"
								class="v-icon notranslate mdi mdi-chevron-right theme--light"></i></span>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</main>